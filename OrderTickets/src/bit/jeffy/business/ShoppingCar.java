package bit.jeffy.business;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

import bit.jeffy.dao.ShoppingCarDao;
import bit.jeffy.orm.Flight;
import bit.jeffy.orm.Order;
import bit.jeffy.orm.OrderItem;
import bit.jeffy.orm.User;

public class ShoppingCar {
	private ShoppingCarDao cardao;
	
	public ShoppingCarDao getCardao() {
		return cardao;
	}

	public void setCardao(ShoppingCarDao cardao) {
		this.cardao = cardao;
	}
	
	
	//异常还没有处理
	public void list(HttpServletRequest request, JspWriter out) throws Exception{
		String tmp = (String)request.getParameter("page");
		
		if(tmp != null){
			listpage(request,out,Integer.parseInt(tmp));
		}else{
			listpage(request,out,1);
		}
	}
	
	public void listpage(HttpServletRequest request, JspWriter out, int page) throws Exception{
		Long id = (Long)(request.getSession().getAttribute("curr_id"));	
		List list = cardao.getAllOrders(id);
		
		if(list == null){
			out.print("读取定单失败");
			return ;
		}
		
		int total = list.size();
		int count = 0;
		Iterator it = list.iterator();
		Order order;
		User user;
		OrderItem item;
		Flight flight;
		
		while(count < (page-1)*5 && it.hasNext()){
			it.next();
			count++;
		}
		
		count = 0;
		out.print("<table width=90%  border=5 cellspacing=0>");
		out.print("<tr align=center bgcolor=#3399FF><td width=20%>用户名</td><td width=20%>航班</td>"+
				"<td width=20%>票价</td>"+"<td width=30%>日期</td><td width=10%>退票</td></tr>");
		while(it.hasNext() && count<5){			
			order = (Order)it.next();
			user = (User)order.getUser();
			item = (OrderItem)order.getOrderitem();
			flight = (Flight)order.getOrderitem().getFlight();
			out.print("<tr><td>"+user.getAccount_no()+"</td><td>"+flight.getFlight_no()+
					"</td><td>"+flight.getPrice()+"</td><td>"+item.getDate()+"</td>");
			out.print("<td><a href=/OrderTickets/Retrieve.do?order_id="+order.getId()+">退票</a></td></tr>");
			count++;
		}
		out.print("<tr><td colspan=5 align=center>");
		out.print("<table width=50% border=0 cellspacing=0><tr>");
		if((page-1) > 0)
			out.print("<td width=50%><a href=/OrderTickets/view/shoppingcar.jsp?page="+(page-1)+">上一页</a></td>");
		else
			out.print("<td width=50%>上一页</td>");
		if((page-1) < (total/5))
			out.print("<td width=50%><a href=/OrderTickets/view/shoppingcar.jsp?page="+(page+1)+">下一页</a></td>");
		else
			out.print("<td width=50%>下一页</td>");
		out.print("</tr></table></td></tr>");
		out.print("</table>");
	}

	

}
