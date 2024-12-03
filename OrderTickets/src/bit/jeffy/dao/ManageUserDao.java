package bit.jeffy.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bit.jeffy.orm.User;

public class ManageUserDao extends HibernateDaoSupport{
	private static final Log log = LogFactory.getLog(ManageUserDao.class);
	
	protected void initDao() {
		
	}
	
	public boolean UpdateUser(User u){
		
		try{
			this.getHibernateTemplate().update(u);
		}catch(Exception e){
			log.error(e.getMessage());
			return false;
		}
		return true;
	}
}
