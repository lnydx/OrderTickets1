package bit.jeffy.bean;

import org.apache.struts.action.ActionForm;

public class RegUser extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String account_id;
	private String name;
	private String password;
	private String password_ag;
	private String sex;
	private String phone;
	private String email;
	
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_ag() {
		return password_ag;
	}
	public void setPassword_ag(String password_ag) {
		this.password_ag = password_ag;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
