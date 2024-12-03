package bit.jeffy.dao;

import java.sql.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bit.jeffy.orm.Flight;
import bit.jeffy.orm.OrderItem;

public class CreateOrderItemDao extends HibernateDaoSupport{
	private static final Log log = LogFactory.getLog(CreateOrderItemDao.class);
	
	protected void initDao() {
	
	}
	
	public boolean CreateOrderItem(Long id, Date date){
		Flight f = (Flight)this.getHibernateTemplate().load(Flight.class,id);
		OrderItem item = new OrderItem();
		item.setFlight(f);
		item.setDate(date);
		
		try{
			this.getHibernateTemplate().save(item);
			return true;
		}catch(Exception e){
			log.error(e.getMessage());
			return false;
		}
	}
	
}
