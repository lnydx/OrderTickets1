<%@ page language="java" import="org.springframework.context.ApplicationContext" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.context.support.FileSystemXmlApplicationContext"%>
<%@ page import="bit.jeffy.business.ShoppingCar"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
  <head>
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
  </head>
  <body>
  <table width="100%" height="439"  border="1" bordercolor="#00CCFF" bgcolor="#00CCFF">
    <tr>
      <td height="22"><%@ include file="head.jsp"%></td>
    </tr>
    <tr>
      <td height="388" valign="top" align="center">
      	<%
      		String path = (String)session.getAttribute("path");
           if(path == null){
          		out.print("读取数据库失败");
            }else{
            	ApplicationContext context = 
	      		new FileSystemXmlApplicationContext(path);
	      		ShoppingCar car = (ShoppingCar)context.getBean("shopcar");
	      		car.list(request,out);
            }
      	%>
      </td>
    </tr>
    <tr>
      <td height="19"><html:errors/>
        <p align="center">www.asxan.com</p>
        <p align="center">思翔科技 版权所有 Copyright@2007-2012</p>
      <DIV>
        <div align="center">建议使用IE6.0以上版本浏览</div>
      </DIV></td>
    </tr>
  </table>
  </body>
</html>
