package bit.jeffy.bean;

import org.apache.struts.action.ActionForm;

public class FlightBean extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String flight_no;
	private String start_place;
	private String end_place;
	private int time;
	private double price;
	 
	public String getEnd_place() {
		return end_place;
	}
	public void setEnd_place(String end_place) {
		this.end_place = end_place;
	}
	public String getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStart_place() {
		return start_place;
	}
	public void setStart_place(String start_place) {
		this.start_place = start_place;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
