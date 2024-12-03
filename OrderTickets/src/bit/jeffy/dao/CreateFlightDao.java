package bit.jeffy.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bit.jeffy.orm.Flight;

public class CreateFlightDao extends HibernateDaoSupport{
	/*private String hql = "from User u where u.account_no=? and u.password=?";*/
	private static final Log log = LogFactory.getLog(LogUserDao.class);
	
	protected void initDao() {
	
	}
	
	public boolean saveFlight(Flight f){
		try{
			this.getHibernateTemplate().save(f);
		}catch(Exception e){
			log.error(e.getMessage());
			return false;
		}
		return true;
	}
}
