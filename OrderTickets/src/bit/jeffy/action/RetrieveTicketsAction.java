package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.dao.RetrieveTicketsDao;

public class RetrieveTicketsAction extends Action{
	private RetrieveTicketsDao retrievedao;
	public RetrieveTicketsDao getRetrievedao() {
		return retrievedao;
	}
	public void setRetrievedao(RetrieveTicketsDao retrievedao) {
		this.retrievedao = retrievedao;
	}
	
	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		ActionMessages errors = new ActionMessages();
		String o = (String)request.getParameter("order_id");
		
		if(o == null){
			errors.add("fail_2",new ActionMessage("RetrieveTicketsAction.b"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		if(!retrievedao.RetrieveTicket(Long.parseLong(o))){
			errors.add("fail_1",new ActionMessage("RetrieveTicketsAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}	
		
		return (map.findForward("retrok"));
	}	
}
