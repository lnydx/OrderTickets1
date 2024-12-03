package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.dao.PurchaseDao;

public class PurchaseAction extends Action{
	private PurchaseDao purchasedao;

	public PurchaseDao getPurchasedao() {
		return purchasedao;
	}

	public void setPurchasedao(PurchaseDao purchasedao) {
		this.purchasedao = purchasedao;
	}

	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		ActionMessages errors = new ActionMessages();
		String f = (String)request.getParameter("orderitem_id");
		Long u = (Long)request.getSession().getAttribute("curr_id");
		Long fi = new Long(Integer.parseInt(f));
		
		if(u == null || f == null){
			errors.add("fail_1",new ActionMessage("PurchaseAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
			
		if(!purchasedao.PurchaseFlight(u,fi)){
			errors.add("fail_2",new ActionMessage("PurchaseAction.b"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
		
		return (map.findForward("purchok"));
	}

}
