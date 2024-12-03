package bit.jeffy.orm;

public class Order {
	private Long id;
	private User user;
	private OrderItem orderitem;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public OrderItem getOrderitem() {
		return orderitem;
	}
	public void setOrderitem(OrderItem orderitem) {
		this.orderitem = orderitem;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
