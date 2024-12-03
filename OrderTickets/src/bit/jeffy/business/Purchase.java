package bit.jeffy.business;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

import bit.jeffy.dao.PurchaseDao;
import bit.jeffy.orm.Flight;
import bit.jeffy.orm.OrderItem;

public class Purchase {
	private PurchaseDao purchasedao;

	public PurchaseDao getPurchasedao() {
		return purchasedao;
	}

	public void setPurchasedao(PurchaseDao purchasedao) {
		this.purchasedao = purchasedao;
	}
	
	public void list(HttpServletRequest request, JspWriter out) throws Exception{
		String tmp = (String)request.getParameter("p_page");
		
		if(tmp != null){
			listpage(request,out,Integer.parseInt(tmp));
		}else{
			listpage(request,out,1);
		}
	}
	
	public void listpage(HttpServletRequest request, JspWriter out, int page) throws Exception{
		List list = purchasedao.getAllFlights();
		if( list == null){
			out.print("读取航班失败");
			return ;
		}
		
		int total = list.size();
		int count = 0;
		Iterator it = list.iterator();
		OrderItem item;
		Flight flight;
		
		while(count < (page-1)*5 && it.hasNext()){
			it.next();
			count++;
		}
		
		count = 0;
		out.print("<table width=90%  border=5 cellspacing=0>");
		out.print("<tr align=center bgcolor=#3399FF><td width=20%>航班号</td><td width=20%>出发地点</td>"+
				"<td width=20%>到达地点</td>"+"<td width=10%>航班日期</td><td width=20%>价格</td>"+
				"<td width=10%>预订</td></tr>");
		while(it.hasNext() && count<5){			
			item = (OrderItem)it.next();
			flight = (Flight)item.getFlight();
			out.print("<tr><td>"+flight.getFlight_no()+"</td><td>"+flight.getStart_place()+
					"</td><td>"+flight.getEnd_place()+"</td><td>"+item.getDate()+
					"</td><td>"+flight.getPrice()+"</td>");
			out.print("<td><a href=/OrderTickets/Purchase.do?orderitem_id="+item.getId()+">预订</a></td></tr>");
			count++;
		}
		out.print("<tr><td colspan=6 align=center>");
		out.print("<table width=50% border=0 cellspacing=0><tr>");
		if((page-1) > 0)
			out.print("<td width=50%><a href=/OrderTickets/view/purchase.jsp?p_page="+(page-1)+">上一页</a></td>");
		else
			out.print("<td width=50%>上一页</td>");
		if((page-1) < (total/5))
			out.print("<td width=50%><a href=/OrderTickets/view/purchase.jsp?p_page="+(page+1)+">下一页</a></td>");
		else
			out.print("<td width=50%>下一页</td>");
		out.print("</tr></table></td></tr>");
		out.print("</table>");
	}
}
