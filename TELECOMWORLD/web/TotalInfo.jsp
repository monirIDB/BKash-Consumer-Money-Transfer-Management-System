<%-- 
    Document   : TotalInfo
    Created on : Nov 3, 2016, 6:02:45 PM
    Author     : APCL
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ALL STUDENT's RESULT</h1>
         <div style="height:1200px; width:100%; margin:0px auto; background-color:forestgreen ;">           
          <form  style="height:1000px; width:80%; margin: 0px auto; background-color:aquamarine ">
            <table border="1">
                 <c:forEach var="row" items="${requestScope.showRes}">
                  
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>BANGLA</th>
                        <th>ENGLISH</th>
                        <th>MATH</th>
                        <th>SOCIAL SCIENCE</th>
                        <th>GENERAL SCIENCE</th>
                        <th>RELIGION</th>
                        <th>AGICULTURE</th>
                        <th>GPA</th>
                        <th>GREAD</th>
                    </tr>
                </thead>
                 <tbody>
                
                       <tr>
                            <td>${row.id}</td>
                            <td>${row.name}</td>
                            <td>${row.bangla}</td>
                            <td>${row.english}</td>
                            <td>${row.math}</td>
                            <td>${row.socialscience}</td>
                            <td>${row.generalscience}</td>
                            <td>${row.religion}</td>
                            <td>${row.agriculture}</td>
                            <td>${row.gpa}</td>
                            <td>${row.grade}</td>
                       </tr>
                    </c:forEach>
                 </tbody>
            </table>
            </table>
        </form>
       </div>
    </body>
</html>
