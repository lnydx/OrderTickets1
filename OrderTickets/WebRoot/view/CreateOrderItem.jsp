<%@ page language="java" import="java.util.List" pageEncoding="UTF-8"%>
<%@ page import="java.util.Iterator" %>
<%@ page import="bit.jeffy.orm.Flight" %>
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
	List list = (List)request.getAttribute("items");
	Iterator it = (Iterator)list.iterator();
	Flight f = null;
	String id = null, str = null,year = null, month = null, day = null;
	int y = 107, m = -1, d = 1;
%>
<style type="text/css">
<!--
.STYLE1 {
	font-family: "宋体";
	font-size: 24px;
	color: #333399;
	font-weight: bold;
}
-->
</style>
<body>
<html:form action="/CreateOrderItem.do">
  <div align="center">
    <table width="97%" height="547"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
      <tr>
        <td height="60" align="center"><div align="center">
          <table width="918" border="2">
            <tr bordercolor="#66CCFF" bgcolor="#66CCFF">
              <td width="117" height="79"><div align="center"><img src="pic/greenearth.gif" width="119" height="81"></div></td>
              <td width="642"><div align="center">
                  <table width="100%" height="65"  border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                    <tr>
                      <td height="35" align="center" bgcolor="#0099FF"><img src="pic/title01.jpg" width="650" height="82"></td>
                    </tr>
                  </table>
              </div></td>
              <td width="118"><div align="center"><img src="pic/flighthead.jpg" width="124" height="80"></div></td>
            </tr>
          </table>
        </div></td>
      </tr>
      <tr>
        <td height="17" align="center"><hr></td>
      </tr>
      <tr>
        <td height="314" align="center">
          <div align="center">
            <table width="78%" height="266"  border="5" bordercolor="#66CCFF" bgcolor="#00CCFF">
                <tr>
                  <td height="73" colspan="2" align="center"><span class="STYLE1">安排航班</span></td>
                </tr>
                <tr>
                  <td width="23%" height="73" align="center">选 择 航 班</td>
                  <td width="77%"><html:select property="id" multiple="false" size="1">
                      <%
			while(it.hasNext()){
				f = (Flight)it.next();
				id = f.getId().longValue()+"";
				str = f.getFlight_no();
		%>
                      <html:option value="<%=id%>"><%=str%></html:option>
                      <%
			}
		%>
                      </html:select>                    </td>
                </tr>
                <tr>
                 <td height="69" align="center">设定航班日期</td>
                  <td align="center"><table width="95%"  border="1" bordercolor="#66CCFF" bgcolor="#00CCFF">
                      <tr bordercolor="#66CCFF" bgcolor="#00CCFF">
                        <td height="34"><select name="year" multiple="multiple" size="1"><option value="107">2007</option>
                            
                            <option value="108">2008</option>
                            
                            <option value="109">2009</option>
                            
                            <option value="110">2010</option>
                            
                            <option value="111">2011</option>
                            
                            <option value="112">2012</option>
                            
                            <option value="113">2013</option>
                            
                            <option value="114">2014</option>
                            
                            <option value="115">2015</option></select>
                        年 </td>
                        <td><select name="month" multiple="multiple" size="1"><option value="0">1</option>
                            
                            <option value="1">2</option>
                            
                            <option value="2">3</option>
                            
                            <option value="3">4</option>
                            
                            <option value="4">5</option>
                            
                            <option value="5">6</option>
                            
                            <option value="6">7</option>
                            
                            <option value="7">8</option>
                            
                            <option value="8">9</option>
                            
                            <option value="9">10</option>
                            
                            <option value="10">11</option>
                            
                            <option value="11">12</option></select>
                        月 </td>
                        <td><select name="day" multiple="multiple" size="1"><option value="1">1</option>
                            
                            <option value="2">2</option>
                            
                            <option value="3">3</option>
                            
                            <option value="4">4</option>
                            
                            <option value="5">5</option>
                            
                            <option value="6">6</option>
                            
                            <option value="7">7</option>
                            
                            <option value="8">8</option>
                            
                            <option value="9">9</option>
                            
                            <option value="10">10</option>
                            
                            <option value="11">11</option>
                            
                            <option value="12">12</option>
                            
                            <option value="13">13</option>
                            
                            <option value="14">14</option>
                            
                            <option value="15">15</option>
                            
                            <option value="16">16</option>
                            
                            <option value="17">17</option>
                            
                            <option value="18">18</option>
                            
                            <option value="19">19</option>
                            
                            <option value="20">20</option>
                            
                            <option value="21">21</option>
                            
                            <option value="22">22</option>
                            
                            <option value="23">23</option>
                            
                            <option value="24">24</option>
                            
                            <option value="25">25</option>
                            
                            <option value="26">26</option>
                            
                            <option value="27">27</option>
                            
                            <option value="28">28</option>
                            
                            <option value="29">29</option>
                            
                            <option value="30">30</option>
                            
                            <option value="31">31</option></select>
                        日 </td>
                      </tr>
                    </table></td>
                </tr>
                <tr>
                  <td colspan="2" align="center"><table width="58%" height="37"  border="0" cellspacing="0">
                      <tr align="center">
                        <td><input type="submit" name="submit" value="设定"></td>
                      </tr>
                    </table></td>
                </tr>
              </table>
          </div></td></tr>
      <tr>
        <td><p align="center">www.asxan.com</p>
          <p align="center">思翔科技 版权所有 Copyright@2007-2012</p>
          <DIV>
            <div align="center">建议使用IE6.0以上版本浏览</div>
          </DIV>
          <html:errors/></td>
      </tr>
    </table>
  </div>
</html:form>
</body>
</html:html>