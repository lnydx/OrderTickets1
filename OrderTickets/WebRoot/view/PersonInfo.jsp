
<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
<!--
.STYLE1 {
	font-size: 24px;
	font-weight: bold;
	font-family: "宋体";
	color: #333399;
}
-->
    </style>
</head>
  
  <body>
  <div align="center">
    <table width="90%" height="403"  border="0" cellspacing="0" bordercolor="#00CCFF" bgcolor="#00CCFF">
      <tr>
        <td height="60" align="center"><table width="97%" height="121"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
          <tr>
            <td height="115" align="center"><table width="916" border="2">
                <tr bordercolor="#66CCFF" bgcolor="#66CCFF">
                  <td width="117" height="79"><div align="center"><img src="../pic/greenearth.gif" width="130" height="79"></div></td>
                  <td width="642"><div align="center">
                      <table width="100%" height="65"  border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                        <tr>
                          <td height="35" align="center" bgcolor="#0099FF"><img src="../pic/title01.jpg" width="648" height="82"></td>
                        </tr>
                      </table>
                  </div></td>
                  <td width="118"><div align="center"><img src="../pic/flighthead.jpg" width="130" height="79"></div></td>
                </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="15"><html:link page="/PurchaseReturn.do">返回上一页></html:link></td>
        </tr>
      <tr>
        <td height="15"><hr></td>
        </tr>
      <tr>
        <td height="311" align="center">
          <html:form action="/ManageUserAct.do">
            <table width="59%" height="280"  border="10" cellspacing="1" bordercolor="#66CCFF">
              <tr>
                <td colspan="2" align="center"><span class="STYLE1">用户个人信息管理</span></td>
              </tr>
              <tr>
                <td width="29%" align="center">姓 名</td>
                <td width="71%"><html:text property="name" size="20" maxlength="20"/></td>
            </tr>
              <tr>
                <td align="center" bgcolor="#0099FF">密 码</td>
                <td bgcolor="#0099FF"><html:password property="password" size="13" maxlength="10"/></td>
            </tr>
              <tr>
                <td align="center">再次输入密码</td>
              <td><html:password property="password_ag" size="13" maxlength="10"/></td>
            </tr>
              <tr>
                <td align="center" bgcolor="#0099FF">性 别</td>
                <td bgcolor="#0099FF"><html:text property="sex" size="3" maxlength="2"/></td>
            </tr>
              <tr>
                <td align="center">电 话</td>
                <td><html:text property="phone" size="20" maxlength="20"/></td>
            </tr>
              <tr>
                <td align="center" bgcolor="#0099FF">电子邮件</td>
              <td bgcolor="#0099FF"><html:text property="email" size="30" maxlength="30"/></td>
            </tr>
              <tr>
                <td height="22" colspan="2" align="center"><table width="68%"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
                  <tr>
                    <td width="50%" height="26" align="center"><html:submit property="submit" value="提交"/></td>
                  <td width="50%" valign="middle"></td>
                </tr>
                </table></td>
            </tr>
              <tr>
                <td height="22" colspan="2" align="center"><html:errors/></td>
            </tr>
            </table>
		    <p>www.asxan.com</p>
		    <p>思翔科技 版权所有 Copyright@2007-2012</p>
		    <DIV>建议使用IE6.0以上版本浏览</DIV>
          </html:form>        </td>
      </tr>
      </table>
  </div>
  </body>
</html>

