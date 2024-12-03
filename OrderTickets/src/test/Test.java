package test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import bit.jeffy.orm.Flight;
import bit.jeffy.orm.Order;

public class Test {
	public static void main(String argv[]){
		String hql="from Order order";
		ApplicationContext context = new FileSystemXmlApplicationContext("WEB-INF/beans.xml");
		HibernateTemplate template = (HibernateTemplate)context.getBean("hibernateTemplate");
		Order order = null;
		
		List list = template.find(hql);
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			order = (Order)it.next();
			Flight f = (Flight)order.getOrderitem().getFlight();
			System.out.print(order.getId()+",");
			System.out.print(f.getPrice());
			System.out.println("");
		}
	}
}
