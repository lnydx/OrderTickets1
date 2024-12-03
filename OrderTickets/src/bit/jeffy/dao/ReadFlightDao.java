package bit.jeffy.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ReadFlightDao extends HibernateDaoSupport{
	private static final Log log = LogFactory.getLog(LogUserDao.class);
	private String hql = "from Flight flight";
	protected void initDao() {
		
	}
	
	public List readFlight(){
		List list = null;
		try{
			list = this.getHibernateTemplate().find(hql);
			return list;
		}catch(Exception e){
			log.error(e.getMessage());
			return null;
		}
	}
}
