package bit.jeffy.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.dao.ReadFlightDao;

public class ReadFlightAction extends Action{
	private ReadFlightDao readdao;

	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		ActionMessages errors = new ActionMessages();
		List list = readdao.readFlight();
		
		if(list == null){
			errors.add("fail_1",new ActionMessage("ReadFlightAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}else{
			request.setAttribute("items",list);
			return (map.findForward("readok"));
		}
		
	}

	public ReadFlightDao getReaddao() {
		return readdao;
	}

	public void setReaddao(ReadFlightDao readdao) {
		this.readdao = readdao;
	}
}
