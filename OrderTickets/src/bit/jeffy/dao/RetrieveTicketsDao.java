package bit.jeffy.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import bit.jeffy.orm.Order;

public class RetrieveTicketsDao extends HibernateDaoSupport{
private static final Log log = LogFactory.getLog(RetrieveTicketsDao.class);
	
	protected void initDao() {	
	}
	
	public boolean RetrieveTicket(long id){
		Long i = new Long(id);
		Order order;
		
		try{
			order = (Order)this.getHibernateTemplate().load(Order.class,i);
			this.getHibernateTemplate().delete(order);
		}catch(Exception e){
			log.error(e.getMessage());
			return false;
		}
		return true;
	}
}
