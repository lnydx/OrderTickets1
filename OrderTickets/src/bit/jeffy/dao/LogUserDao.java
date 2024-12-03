package bit.jeffy.dao;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import bit.jeffy.orm.User;


public class LogUserDao extends HibernateDaoSupport{

	private String hql = "from User u where u.account_no=? and u.password=?";
	private static final Log log = LogFactory.getLog(LogUserDao.class);
	
	protected void initDao() {
	
	}
		
	public boolean IsUserValid(String userid, String password){
		String[] userlist = new String[2];
		userlist[0] = userid;
		userlist[1] = password;
		
		List ret = null;
		
		try{
			ret = this.getHibernateTemplate().find(hql,userlist);
		}catch(Exception e){
	        log.error(e.getMessage());
	        return false;
		}
		
		if(ret.size() > 0)
			return true;
		else
			return false;
	}
	
	public User getUser(String userid, String password){
		String[] userlist = new String[2];
		userlist[0] = userid;
		userlist[1] = password;
		
		List ret = null;
		Iterator it = null;
		
		try{
			ret = this.getHibernateTemplate().find(hql,userlist);
			it = ret.iterator();
			return (User)it.next();
		}catch(Exception e){
	        log.error(e.getMessage());
	        return null;
		}
	}
}
