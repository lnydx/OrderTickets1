<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    <title>主页</title>   
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
  </head>
  <%
  		Long tmp = (Long)session.getAttribute("curr_id");
  		if(tmp != null)
  			session.removeAttribute("curr_id");
  		String t = (String)session.getAttribute("curr_user");
  		if(t != null)
  			session.removeAttribute("curr_user");
  %>
  <body>
    <div align="center">
      <table width="65%" height="625"  border="0" cellspacing="0">
        <tr bordercolor="#00CCFF" bgcolor="#00CCFF">
          <td height="67" align="center"><table width="901" border="2">
            <tr bordercolor="#66CCFF" bgcolor="#66CCFF">
              <td width="117" height="79"><div align="center"><img src="pic/greenearth.gif" width="119" height="81"></div></td>
              <td width="642"><div align="center">
                <table width="100%" height="65"  border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                  <tr>
                    <td height="35" align="center" bgcolor="#0099FF"><img src="pic/title01.jpg" width="627" height="82"></td>
                    </tr>
                  </table>
              </div></td>
              <td width="118"><div align="center"><img src="pic/flighthead.jpg" width="124" height="80"></div></td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td height="10" align="center"><table width="100%"  border="0" cellspacing="0">
            <tr>
              <td width="77%" height="21" bgcolor="#66CCFF">如果您还没有注册，请点击
              <html:link page="/view/reg.jsp">注册</html:link></td>
              <td width="23%" bgcolor="#66CCFF"><html:link page="/admin.jsp">管理员登录</html:link></td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td height="11" align="center"><hr></td>
        </tr>
        <tr>
          <td height="384" align="center" valign="middle" bgcolor="#00CCFF">
            <html:form action="/Log.do" focus="userid">
              <table width="906" height="361" border="2" bordercolor="#00CCFF" bgcolor="#00CCFF">
                <tr>
                  <td width="419" height="78"><p align="center">最新各城市机场出港航班时刻表</p>
                <p align="left">最新各城市机场到港航班时刻表</p></td>
                <td width="469"><img src="pic/welcome.gif" width="469" height="81" align="absmiddle"></td>
              </tr>
                <tr>
                  <td height="260"><table width="104%" height="258"  border="10" cellpadding="10" cellspacing="0" bordercolor="#66CCFF" bgcolor="#00CCFF">
                  <tr bordercolor="#000000" bgcolor="#00CCFF">
                    <td colspan="2" bordercolor="#00CCFF"><table width="96%" height="38"  border="0" cellspacing="0" bordercolor="#000000">
                        <tr>
                          <td width="24%" align="center">用户名</td>
                          <td width="76%"><html:text property="userid" size="13" maxlength="15"/></td>
                        </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td colspan="2"><table width="96%" height="33"  border="0" cellspacing="0">
                        <tr>
                          <td width="24%" align="center">密 码</td>
                          <td width="76%"><html:password property="password" size="13" maxlength="15"/></td>
                        </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td width="47%" height="48" align="center"><html:submit property="submit" value="提交"/></td>
                    <td width="53%" align="center"><html:reset>重置</html:reset></td>
                  </tr>
                </table></td>
                <td><div align="center"><img src="pic/meinv.jpg" width="464" height="256"></div></td>
              </tr>
              </table>
		  </html:form>
          <html:errors/></td>
        </tr>
        <tr bgcolor="#00CCFF">
          <td><div align="center">
            <p>www.asxan.com</p>
            <p>思翔科技 版权所有 Copyright@2007-2012</p>
            <DIV>建议使用IE6.0以上版本浏览</DIV>
            <p>&nbsp;</p>
          </div></td>
        </tr>
      </table>
    </div>
  </body>
</html:html>
