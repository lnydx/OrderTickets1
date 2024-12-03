package bit.jeffy.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bit.jeffy.orm.Order;
import bit.jeffy.orm.OrderItem;
import bit.jeffy.orm.User;

public class PurchaseDao extends HibernateDaoSupport{
	private static final Log log = LogFactory.getLog(PurchaseDao.class);
	private String hql = "from OrderItem item";
		
	protected void initDao() {	
	}
	
	public List getAllFlights(){
		List list = null;
		
		try{
			list = this.getHibernateTemplate().find(hql);
		}catch(Exception e){
			log.error(e.getMessage());
			return null;
		}
		
		return list;
	}
	
	public boolean PurchaseFlight(Long uid, Long oid){
		Order order = new Order();
		User user = (User)this.getHibernateTemplate().load(User.class,uid);
		OrderItem item = (OrderItem)this.getHibernateTemplate().load(OrderItem.class,oid);
		order.setUser(user);
		order.setOrderitem(item);
		
		try{
			this.getHibernateTemplate().save(order);
		}catch(Exception e){
			log.error(e.getMessage());
			return false;
		}
		return true;
	}
}
