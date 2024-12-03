package bit.jeffy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import bit.jeffy.bean.FlightBean;
import bit.jeffy.dao.CreateFlightDao;
import bit.jeffy.orm.Flight;

public class CreateFlightAction extends Action{
	private CreateFlightDao flightdao;
	public ActionForward execute(ActionMapping map, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成方法存根
		ActionMessages errors = new ActionMessages();
		String flight_no = (String)((FlightBean)form).getFlight_no();
		String start_place = (String)((FlightBean)form).getStart_place();
		String end_place = (String)((FlightBean)form).getStart_place();
		int time = (int)((FlightBean)form).getTime();
		double price = (double)((FlightBean)form).getPrice();
		flight_no = new String(flight_no.getBytes("ISO-8859-1"),"GB2312");
		start_place = new String(start_place.getBytes("ISO-8859-1"),"GB2312");
		end_place = new String(end_place.getBytes("ISO-8859-1"),"GB2312");
		
		Flight flight = new Flight();
		flight.setFlight_no(flight_no);
		flight.setStart_place(start_place);
		flight.setEnd_place(end_place);
		flight.setTime(time);
		flight.setPrice(price);
		
		if( !flightdao.saveFlight(flight)){
			errors.add("fail_1",new ActionMessage("CreateFlightAction.a"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}else{
			errors.add("succeed_1",new ActionMessage("CreateFlightAction.b"));
			saveErrors(request,errors);
			return (map.getInputForward());
		}
	}
	public CreateFlightDao getFlightdao() {
		return flightdao;
	}
	public void setFlightdao(CreateFlightDao flightdao) {
		this.flightdao = flightdao;
	}
	

}
