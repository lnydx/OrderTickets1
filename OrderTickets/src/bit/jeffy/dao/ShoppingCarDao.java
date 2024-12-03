package bit.jeffy.dao;

import java.util.List;
import bit.jeffy.orm.User;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ShoppingCarDao extends HibernateDaoSupport{
	private static final Log log = LogFactory.getLog(ShoppingCarDao.class);
	private String hql="from Order order where order.user=?";
	
	protected void initDao() {	
	}
	
	public List getAllOrders(Long obj){
		List list = null;
		try{
			User u = (User)this.getHibernateTemplate().load(User.class,obj);
			list = this.getHibernateTemplate().find(hql,u);
		}catch(Exception e){
			log.error(e.getMessage());
			return null;
		}
		return list;
	}
}
