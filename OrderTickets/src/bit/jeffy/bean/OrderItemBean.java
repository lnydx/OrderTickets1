package bit.jeffy.bean;

import org.apache.struts.action.ActionForm;

public class OrderItemBean extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String year;
	private String month;
	private String day;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
