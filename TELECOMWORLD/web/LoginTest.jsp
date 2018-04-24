<%-- 
    Document   : ChackLogIn
    Created on : Oct 27, 2016, 4:12:24 PM
    Author     : APCL
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
      <body>  
        <sql:setDataSource var="Source" driver="com.mysql.jdbc.Driver"  url="jdbc:mysql://localhost:3306/telecomdb" user="root" password="apcl123456" />

        <sql:query var="res" dataSource="${Source}">
            select * from customar where phoneNumber=? and email=?;
            <sql:param value="${param.phoneNumber}"/>
            <sql:param value="${param.email}"/>
          </sql:query>
            <c:choose>  
                <c:when test="${res.rowCount gt 0}">
                     <c:redirect url="AgentReg.jsp"></c:redirect>
                </c:when>
               
                <c:otherwise>
                      <c:redirect url="LogInPage.jsp"></c:redirect>
                 </c:otherwise>
           </c:choose> 
            
          </body>    
    
</html>
