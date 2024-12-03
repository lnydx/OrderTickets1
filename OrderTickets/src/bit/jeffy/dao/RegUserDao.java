package bit.jeffy.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bit.jeffy.orm.User;

public class RegUserDao extends HibernateDaoSupport{
	private String hql = "from User u where u.account_no=?";
	private static final Log log = LogFactory.getLog(LogUserDao.class);
	
	protected void initDao() {	
	}
	
	public boolean ifexist(String userid){
		List ret = null;
		
		try{
			ret = this.getHibernateTemplate().find(hql,userid);
		}catch(Exception e){
	        log.error("read failed-RegUserDao");
	        return true;
		}
		
		if(ret.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean RegUser(User u){
		try{
			this.getHibernateTemplate().save(u);
		}catch(Exception e){
			log.error("save failed-RegUserDao");
			return false;
		}
		return true;
	}
}
