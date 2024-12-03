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
    <style type="text/css">
<!--
.STYLE1 {
	font-family: "宋体";
	color: #FF0000;
}
.STYLE2 {font-family: "宋体"; color: #0033FF; }
.STYLE3 {color: #0033FF}
-->
    </style>
  </head>
<%
	String tmp = (String)session.getAttribute("curr_admin");
	if( tmp != null ){
		session.removeAttribute("curr_admin");
	}
%>

  <body>
    <div align="center">
      <table width="94%" height="676"  border="0" cellspacing="0">
        <tr>
          <td height="43" align="center" bgcolor="#00CCFF"><div align="center">
            <table width="901" border="2">
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
                    </table>
          </div></td>
        </tr>
        <tr>
          <td height="10" align="center" bgcolor="#00CCFF"><table width="90%"  border="0" cellspacing="0">
          </table></td>
        </tr>
        <tr>
          <td height="11" align="center" bgcolor="#00CCFF"><hr></td>
        </tr>
        <tr>
          <td height="480" align="center" valign="middle" bgcolor="#00CCFF">
            <html:form action="/AdminLog.do" focus="userid">
              <table width="894" height="500" border="2" bordercolor="#00CCFF" bgcolor="#00CCFF">
                <tr>
                  <td width="355" height="89"><img src="pic/adminflight.jpg" width="439" height="85"></td>
                  <td width="469"><img src="pic/adminflight1.jpg" width="437" height="85"></td>
                </tr>
                <tr>
                  <td height="401" bordercolor="#00CCFF" bgcolor="#00CCFF"><table width="89%" height="233"  border="10" cellpadding="10" cellspacing="0" bordercolor="#66CCFF" bgcolor="#00CCFF">
                    <tr bordercolor="#000000" bgcolor="#00CCFF">
                      <td colspan="2" bordercolor="#00CCFF"><table width="90%" height="38"  border="0" cellspacing="0">
                          <tr>
                            <td width="24%" align="center">用户名</td>
                            <td width="76%"><html:text property="userid" size="13" maxlength="15"/></td>
                          </tr>
                      </table></td>
                    </tr>
                    <tr>
                      <td colspan="2"><table width="90%" height="33"  border="0" cellspacing="0">
                          <tr>
                            <td width="24%" align="center">密 码</td>
                            <td width="76%"><html:password property="password" size="13" maxlength="15"/></td>
                          </tr>
                      </table></td>
                    </tr>
                    <tr>
                      <td width="47%" height="87" align="center"><html:submit property="submit" value="提交"/></td>
                      <td width="53%" align="center"><html:reset>重置</html:reset></td>
                    </tr>
                  </table></td>
                  <td><p align="center" class="STYLE1"><STRONG>民航航班时刻管理暂行办法</STRONG></p>
                  <p align="center" class="STYLE2">第一章　总　　则</p>
                  <p class="STYLE2"><STRONG> 第一条</STRONG>　为规范民航航班时刻管理工作，加强对航班时刻使用的监督和管</p>
                  <p class="STYLE2">理，建立航班时刻公平、公开分配的管理程序与有效使用机制，制定本办</p>
                  <p class="STYLE2">法。</p>
                  <p class="STYLE2">......</p>
                  <p align="center" class="STYLE2">第二章　航班时刻管理机构和职责</p>
                  <p align="center" class="STYLE2">第三章　航班时刻的申请和协调</p>
                  <p align="center" class="STYLE2">第四章　航班时刻的交换、调整和归还</p>
                  <p align="center" class="STYLE2">第五章　航班时刻管理信息公布与报告制度</p>
                  <p align="center" class="STYLE2">第六章　监督管理</p>
                  <p class="STYLE3">&nbsp;</p>
                  <p>&nbsp;</p></td>
                </tr>
              </table>
            </html:form>
          <html:errors/>          </td>
        </tr>
        <tr>
          <td bordercolor="#00CCFF" bgcolor="#00CCFF"><div align="center">
            <p>www.asxan.com</p>
            <p>思翔科技 版权所有 Copyright@2007-2012</p>
            <DIV>建议使用IE6.0以上版本浏览</DIV>
          </div></td>
        </tr>
        </table>
    </div>
  </body>
</html:html>
