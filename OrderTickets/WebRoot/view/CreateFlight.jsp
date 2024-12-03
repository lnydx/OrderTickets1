<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>

<%
	String tmp = (String)session.getAttribute("curr_admin");
	if( tmp == null ){
%>
		<jsp:forward page="/index.jsp"/>
<%
	}
%>
<style type="text/css">
<!--
.STYLE1 {
	font-family: "宋体";
	font-size: 24px;
	font-weight: bold;
	color: #333399;
}
-->
</style>
<body>
<html:form action="/CreateFlight.do">
  <div align="center">
    <table width="97%" height="380"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
      <tr>
        <td height="12" align="center"><table width="919" border="2">
          <tr bordercolor="#66CCFF" bgcolor="#66CCFF">
            <td width="119" height="86"><div align="center"><img src="../pic/greenearth.gif" width="128" height="79"></div></td>
            <td width="652"><div align="center">
                <table width="100%" height="65"  border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                  <tr>
                    <td height="35" align="center" bgcolor="#0099FF"><img src="../pic/title01.jpg" width="642" height="82"></td>
                  </tr>
                </table>
            </div></td>
            <td width="124"><div align="center"><img src="../pic/flighthead.jpg" width="128" height="78"></div></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="13" align="center"><html:link page="/view/admincontent.jsp">返回上一页</html:link></td>
      </tr>
      <tr>
        <td height="17" align="center"><hr></td>
      </tr>
      <tr>
        <td height="251" align="center"><table width="57%" height="223"  border="1" bordercolor="#CCCCCC">
          <tr><td colspan="2"><div align="center" class="STYLE1">制定航班</div></td></tr>
          <tr>
            <td width="27%" align="center">航 班 号</td>
            <td width="73%"><html:text property="flight_no" size="20" maxlength="20"/></td>
          </tr>
          <tr>
            <td align="center">起飞地点</td>
            <td><html:text property="start_place" size="20" maxlength="20"/></td>
          </tr>
          <tr>
            <td align="center">目的地点</td>
            <td><html:text property="end_place" size="20" maxlength="20"/></td>
          </tr>
          <tr>
            <td align="center">旅程(小时)</td>
            <td><html:text property="time" size="10" maxlength="4"/></td>
          </tr>
          <tr>
            <td align="center">价 格</td>
            <td><html:text property="price" size="10" maxlength="10"/></td>
          </tr>
          <tr>
            <td height="47" colspan="2" align="center"><table width="90%" height="36"  border="0" cellspacing="0">
              <tr align="center">
                <td width="50%"><html:submit property="submit" value="提交"/></td>
                <td width="50%"><html:reset>重置</html:reset></td>
              </tr>
              </table></td>
            </tr>
          </table></td>
      </tr>
      <tr>
        <td height="44"><html:errors/>
          <p align="center">www.asxan.com</p>
          <p align="center">思翔科技 版权所有 Copyright@2007-2012</p>
          <DIV>
            <div align="center">建议使用IE6.0以上版本浏览</div>
          </DIV></td>
      </tr>
    </table>
  </div>
</html:form>
</body>
</html:html>