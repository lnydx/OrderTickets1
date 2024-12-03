package bit.jeffy.dao;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AdminLogDao extends HibernateDaoSupport{
	private String hql = "from Admin u where u.admin_no=? and u.password=?";
	private static final Log log = LogFactory.getLog(LogUserDao.class);
	
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
}
