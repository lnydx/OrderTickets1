<%@ page language="java" pageEncoding="UTF-8"%>
<html>
  <head>
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
  </head>
  <body>
  <table width="100%" height="481"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
    <tr>
      <td><%@ include file="head.jsp"%></td>
    </tr>
    <tr>
      <td height="341" align="center" bordercolor="#00CCFF" bgcolor="#00CCFF"><table width="59%" height="330"  border="0" cellspacing="0">
        <tr>
          <td width="30%" align="center"><img src="pic/ftp.gif" width="80" height="50"></td>
          <td width="70%"><table width="90%" height="43"  border="0" cellspacing="0">
            <tr>
              <td bgcolor="#66CCFF">
			  <html:link page="/view/PersonInfo.jsp">个人信息管理</html:link></td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td height="100" align="center"><img src="pic/info.gif" width="80" height="50"></td>
          <td><table width="90%" height="43"  border="0" cellspacing="0">
            <tr>
              <td bgcolor="#66CCFF">
			  <html:link page="/view/purchase.jsp">预订机票</html:link>			  </td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td align="center"><img src="pic/water.gif" width="80" height="50"></td>
          <td><table width="90%" height="43"  border="0" cellspacing="0">
            <tr>
              <td bgcolor="#66CCFF">
			  <html:link page="/view/shoppingcar.jsp">查看个人购物车</html:link>			  </td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td align="center">&nbsp;</td>
          <td><table width="90%" height="43"  border="0" cellspacing="0">
            <tr>
              <td bgcolor="#66CCFF">
			  <a href="/OrderTickets/index.jsp" onClick="exit()">退出</a>			  </td>
            </tr>
          </table></td>
        </tr>
      </table></td>
    </tr>
    <tr>
      <td><p align="center">www.asxan.com</p>
        <p align="center">思翔科技 版权所有 Copyright@2007-2012</p>
      <DIV>
        <div align="center">建议使用IE6.0以上版本浏览</div>
      </DIV></td>
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