package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bit.jeffy.bean.LogUser;
import bit.jeffy.dao.LogUserDao;
import bit.jeffy.orm.User;

public class LogAction extends Action{
	private LogUserDao userdao;
	
	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		String path = servlet.getServletContext().getRealPath("/WEB-INF/beans.xml");
		String rp = (String)request.getSession().getAttribute("path");
		if(rp != null){
			request.getSession().removeAttribute("path");
		}
		request.getSession().setAttribute("path",path);
		
		String username = (String)((LogUser)form).getUserid();
		String password = (String)((LogUser)form).getPassword();
		username = new String(username.getBytes("ISO-8859-1"),"GB2312");
		password = new String(password.getBytes("ISO-8859-1"),"GB2312");
		
		HttpSession session = request.getSession();
		ActionMessages errors = new ActionMessages();
		String tmp = null;
		
		if( userdao.IsUserValid(username,password)){
			User u = userdao.getUser(username,password);
			if( u != null)
			{
				tmp = (String)session.getAttribute("curr_user");
				if( tmp == null)
				{
					session.setAttribute("curr_id",u.getId());
					session.setAttribute("curr_user",username);
				}
				else
				{
					session.removeAttribute("curr_id");
					session.removeAttribute("curr_user");
					session.setAttribute("curr_id",u.getId());
					session.setAttribute("curr_user",username);
				}
				return (map.findForward("login"));
			}
			else
			{
				errors.add("fail_1",new ActionMessage("LogAction.a"));
				saveErrors(request,errors);
				return (map.getInputForward());
			}
		}
		else{
			errors.add("fail_2",new ActionMessage("LogAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
	}

	public LogUserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(LogUserDao userdao) {
		this.userdao = userdao;
	}

}
