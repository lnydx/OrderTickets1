package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.bean.AdminUser;
import bit.jeffy.dao.AdminLogDao;

public class AdminLogAction extends Action{
	private AdminLogDao adminlog;
	
	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		String path = servlet.getServletContext().getRealPath("/WEB-INF/beans.xml");
		String rp = (String)request.getSession().getAttribute("path");
		if(rp != null){
			request.getSession().removeAttribute("path");
		}
		request.getSession().setAttribute("path",path);
		
		String username = (String)((AdminUser)form).getUserid();
		String password = (String)((AdminUser)form).getPassword();
		username = new String(username.getBytes("ISO-8859-1"),"GB2312");
		password = new String(password.getBytes("ISO-8859-1"),"GB2312");

		ActionMessages errors = new ActionMessages();
		
		if( adminlog.IsUserValid(username,password)){
			String tmp = (String)request.getSession().getAttribute("curr_admin");
			if(tmp == null){
				request.getSession().setAttribute("curr_admin",username);
			}else{
				request.getSession().removeAttribute("cur_admin");
				request.getSession().setAttribute("curr_admin",username);
			}
			return (map.findForward("login"));
		}else{
			errors.add("fail_1",new ActionMessage("AdminLogAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}

	}

	public AdminLogDao getAdminlog() {
		return adminlog;
	}

	public void setAdminlog(AdminLogDao adminlog) {
		this.adminlog = adminlog;
	}

}
