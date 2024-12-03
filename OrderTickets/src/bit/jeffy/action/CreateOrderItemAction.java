package bit.jeffy.action;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.bean.OrderItemBean;
import bit.jeffy.dao.CreateOrderItemDao;
import bit.jeffy.dao.LogUserDao;

public class CreateOrderItemAction extends Action{
	private CreateOrderItemDao itemdao;
	private static final Log log = LogFactory.getLog(LogUserDao.class);
	
	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO �Զ���ɷ������
		ActionMessages errors = new ActionMessages();
		String id = (String)((OrderItemBean)form).getId();
		String year = (String)((OrderItemBean)form).getYear();
		String month = (String)((OrderItemBean)form).getMonth();
		String day = (String)((OrderItemBean)form).getDay();
		
		if(id==null || year==null || month==null || day==null){
			errors.add("fail_2",new ActionMessage("CreateOrderItemAction.c"));
			saveErrors(request,errors);
			return (map.findForward("createok"));
		}
		
		id = new String(id.getBytes("ISO-8859-1"),"GB2312");
		year = new String(year.getBytes("ISO-8859-1"),"GB2312");
		month = new String(month.getBytes("ISO-8859-1"),"GB2312");
		day = new String(day.getBytes("ISO-8859-1"),"GB2312");
		Long lid = new Long(Long.parseLong(id));

		Date date = new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));		
		if( !itemdao.CreateOrderItem(lid,date)){
			errors.add("fail_1",new ActionMessage("CreateOrderItemAction.a"));
			saveErrors(request,errors);
		}else{
			errors.add("fail_2",new ActionMessage("CreateOrderItemAction.b"));
			saveErrors(request,errors);
		}
		
		return (map.findForward("createok"));
	}

	public CreateOrderItemDao getItemdao() {
		return itemdao;
	}

	public void setItemdao(CreateOrderItemDao itemdao) {
		this.itemdao = itemdao;
	}

}
