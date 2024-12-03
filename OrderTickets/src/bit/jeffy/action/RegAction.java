package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.bean.RegUser;
import bit.jeffy.dao.RegUserDao;
import bit.jeffy.orm.User;

public class RegAction extends Action{
	private RegUserDao regdao;
	
	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		ActionMessages errors = new ActionMessages();
		String account_id = (String)((RegUser)form).getAccount_id();
		String name = (String)((RegUser)form).getName();
		String password = (String)((RegUser)form).getPassword();
		String password_ag = (String)((RegUser)form).getPassword_ag();
		String sex = (String)((RegUser)form).getSex();
		String phone = (String)((RegUser)form).getPhone();
		String email = (String)((RegUser)form).getEmail();
		account_id = new String(account_id.getBytes("ISO-8859-1"),"GB2312");
		name = new String(name.getBytes("ISO-8859-1"),"GB2312");
		password = new String(password.getBytes("ISO-8859-1"),"GB2312");
		password_ag = new String(password_ag.getBytes("ISO-8859-1"),"GB2312");
		sex = new String(sex.getBytes("ISO-8859-1"),"GB2312");
		phone = new String(phone.getBytes("ISO-8859-1"),"GB2312");
		email = new String(email.getBytes("ISO-8859-1"),"GB2312");
		
		if(account_id.equals("")){
			//这里还可以做其他的判断
			errors.add("fail_1",new ActionMessage("RegAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		if(!password.equals(password_ag)){
			errors.add("fail_2",new ActionMessage("RegAction.b"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		User user = new User();
		user.setAccount_no(account_id);
		user.setName(name);
		user.setPassword(password);
		user.setSex(sex);
		user.setPhone(phone);
		user.setEmail(email);
		
		if(regdao.ifexist(account_id)){
			errors.add("fail_3",new ActionMessage("RegAction.c"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		if(regdao.RegUser(user)){
			return (map.findForward("regin"));
		}else{
			errors.add("fail_4",new ActionMessage("RegAction.d"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
	}

	public RegUserDao getRegdao() {
		return regdao;
	}

	public void setRegdao(RegUserDao regdao) {
		this.regdao = regdao;
	}
}
