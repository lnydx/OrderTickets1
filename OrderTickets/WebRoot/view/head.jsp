<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
<body>
  <table width="100%" height="125"  border="0" bordercolor="#00CCFF" bgcolor="#00CCFF" cellspacint="0">
     <tr>
       <td height="57" align="center"><table width="100%" height="52"  border="0" cellspacing="0">
         <tr>
           <td align="center" bgcolor="#0099FF">
           欢迎你,亲爱的
           <%
           		String username = (String)session.getAttribute("curr_user");
           %>
           <%=username%>
           用户!
           </td>
         </tr>
       </table></td>
     </tr>
     <tr>
       <td height="25" align="center" bgcolor="#66CCFF"><table width="92%"  border="0" cellspacing="0">
         <tr align="center">
           <td width="10%"><html:link page="/PurchaseReturn.do">首页</html:link></td>
           <td width="30%"><html:link page="/view/PersonInfo.jsp">个人信息管理</html:link></td>
           <td width="10%"><html:link page="/view/purchase.jsp">订票</html:link></td>
           <td width="40%"><html:link page="/view/shoppingcar.jsp">查看个人购物车</html:link></td>
           <td width="10%"><a href="/OrderTickets/index.jsp" onClick="exit()">退出</a></td>
         </tr>
       </table></td>
     </tr>
     <tr>
       <td height="25"><hr></td>
     </tr>
</table>
</body>
</html>
<script>
function exit()
{
    window.close();
}
</script>