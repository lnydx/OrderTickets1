package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.bean.ManageUser;
import bit.jeffy.dao.ManageUserDao;
import bit.jeffy.orm.User;

public class ManageUserAction extends Action{
	
	private ManageUserDao managedao;

	public ManageUserDao getManagedao() {
		return managedao;
	}
	public void setManagedao(ManageUserDao managedao) {
		this.managedao = managedao;
	}

	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		ActionMessages errors = new ActionMessages();
		Long id = (Long)request.getSession().getAttribute("curr_id");
		String account_id = (String)request.getSession().getAttribute("curr_user");
		
		if(id == null || account_id == null){
			errors.add("fail_1",new ActionMessage("ManageUserAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		String name = (String)((ManageUser)form).getName();
		String password = (String)((ManageUser)form).getPassword();
		String password_ag = (String)((ManageUser)form).getPassword_ag();
		String sex = (String)((ManageUser)form).getSex();
		String phone = (String)((ManageUser)form).getPhone();
		String email = (String)((ManageUser)form).getEmail();
		account_id = new String(account_id.getBytes("ISO-8859-1"),"GB2312");
		name = new String(name.getBytes("ISO-8859-1"),"GB2312");
		password = new String(password.getBytes("ISO-8859-1"),"GB2312");
		password_ag = new String(password_ag.getBytes("ISO-8859-1"),"GB2312");
		sex = new String(sex.getBytes("ISO-8859-1"),"GB2312");
		phone = new String(phone.getBytes("ISO-8859-1"),"GB2312");
		email = new String(email.getBytes("ISO-8859-1"),"GB2312");
		
		if(!password.equals(password_ag)){
			errors.add("fail_2",new ActionMessage("ManageUserAction.b"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		User u = new User();
		u.setId(id);
		u.setAccount_no(account_id);
		u.setName(name);
		u.setPassword(password);
		u.setEmail(email);
		u.setPhone(phone);
		u.setSex(sex);
		
		if(!managedao.UpdateUser(u)){
			errors.add("fail_3",new ActionMessage("ManageUserAction.c"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		return (map.findForward("manageok"));
	}
}
