<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>

<body>
<div align="center">
  <table width="97%" height="529"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
    <tr>
      <td height="27" align="center"><table width="918" border="2">
        <tr bordercolor="#66CCFF" bgcolor="#66CCFF">
          <td width="117" height="86"><div align="center"><img src="pic/greenearth.gif" width="119" height="81"></div></td>
          <td width="642"><div align="center">
              <table width="100%" height="65"  border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                <tr>
                  <td height="35" align="center" bgcolor="#0099FF"><img src="pic/title01.jpg" width="650" height="82"></td>
                </tr>
              </table>
          </div></td>
          <td width="118"><div align="center"><img src="pic/flighthead.jpg" width="124" height="80"></div></td>
        </tr>
      </table></td>
      </tr>
    <tr>
      <td height="17" align="center"><hr></td>
      </tr>
    <tr>
      <td height="314" align="center"><table width="57%" height="161"  border="1" bordercolor="#CCCCCC" bgcolor="#00CCFF">
        <tr>
          <td width="26%"><img src="pic/ftp.gif" width="80" height="50"></td>
            <td width="74%">
              <html:link page="/view/CreateFlight.jsp">制定航班</html:link>              </td>
          </tr>
        <tr>
          <td><img src="pic/water.gif" width="80" height="50"></td>
            <td>
              <html:link page="/ReadFlight.do">安排航班</html:link>              </td>
          </tr>
        </table></td>
      </tr>
    <tr>
      <td><html:errors/>
        <p align="center">www.asxan.com</p>
          <p align="center">思翔科技 版权所有 Copyright@2007-2012</p>
          <DIV>
            <div align="center">建议使用IE6.0以上版本浏览</div>
        </DIV></td>
      </tr>
  </table>
</div>
</body>
</html:html>
