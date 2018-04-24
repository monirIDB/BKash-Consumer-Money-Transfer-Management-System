<%-- 
    Document   : ShowAlCustlRecharge
    Created on : Dec 31, 2016, 9:38:57 PM
    Author     : lenovo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--        carasol resorces-->
        <link rel="stylesheet" href="recorces/css/bootstrap.min.css">
        <script src="recorces/js/jquery.min.js"></script>
        <script src="recorces/js/bootstrap.min.js"></script>
        <link href="resources/bootstrap.css" rel="stylesheet" type="text/css"/>
        <!--        angular resorces-->
        <script src="resources/angular.min.js"></script>
        <script src="resources/angular-animate.js"></script>
        <script src="resources/angular.js"></script> 
        <script src="resources/angular-route.js"></script>
        <!--              parsonal stylesheet-->
        <link rel="stylesheet" type="text/css" href="recorces/css/style.css">
        <style>

            body{background:url(img/backgroung.png)repeat}
            input{width: 500px}
            input.ng-invalid {background-color:pink;}
            input.ng-valid { background-color:lightgreen;}
            form.ng-invalid {background-color:pink;}
            form .ng-valid { background-color: lightgreen; }
        </style>
        <script>

            var myapp = angular.module("exampleApp", []);
            myapp.controller("defaultCtrl", function ($scope) {
                $scope.addUser = function (userDetails) {
                    $scope.message = userDetails.name + " (" + userDetails.email + ") (" + userDetails.agreed + ")";
                }

                $scope.message = "Ready";
            });
        </script>
    </head>
    <body >

        <div class="menu_area fix">
            <div class="main">
                <div class="logo">
                    <img src="img/logo.PNG" />
                </div>
                <div class="main_menu">
                    <ul>
                        <li><a href="index.jsp" style="background:#C52D2F">Home</a></li>
                        <li><a href="#">SIM Packages</a>
                            <ul>
                                <li><a href="ShowAlCustlrecharge.jsp">SIM Packages </a></li>
                                <li><a href="ShowAlCustlrecharge.jsp">SIM Packages</a></li>
                                <li><a href="ShowAlCustlrecharge.jsp">SIM Packages</a></li>

                            </ul>

                        </li>
                        <li><a href="#">MB Package</a>
                            <ul>
                                <li><a href="ShowAlCustlrecharge.jsp">MB Package</a></li>
                                <li><a href="ShowAlCustlrecharge.jsp">MB Package</a></li>
                                <li><a href="ShowAlCustlrecharge.jsp">MB Package</a></li>


                            </ul>
                        </li>
                        <li><a href="ShowAlCustlrecharge.jsp">Offers</a> 
                            <ul>
                                <li><a href="ShowAlCustlrecharge.jsp">Offers</a></li>
                                <li><a href="ShowAlCustlrecharge.jsp">Offers</a></li>
                                <li><a href="ShowAlCustlrecharge.jsp">Offers</a></li>

                            </ul>
                        </li>
                        <li><a href="LogInPage.jsp">Log Out</a>
                            <ul>
                                <li><a href="LogInPage.jsp">Log Out</a></li>
                                <li><a href="LogInPage.jsp">Log Out</a></li>
                                <li><a href="LogInPage.jsp">Log Out</a></li>
                            </ul>

                        </li>
                         <li><a href="CustomarReg.jsp">Customer Reg</a></li>
                    </ul>
                </div>
            </div>
        </div>


        <div  style=" margin: 0px auto;   width:1217px;">
            <div ng-hide="myCheck3" style="height:40px; margin: 0px auto;   width:1217px; background-color: #985f0d">
                <div  style=" margin-left:400px;"> <h3>SHOW ALL YOUR RECHARGE</h3></div>
            </div>


            <div ng-app="exampleApp" id="todoPanel" class="panel" ng-controller="defaultCtrl">

                <form name="myForm" style="width: 500px; margin: 0px auto" method="post" action="ShowCustRcchargeSublet" novalidate>
                    <div class="well">
                        <div class="form-group">
                            <label>RETAILER Phone Number:</label>
                            <input name="aphoneNumber" type="number" ng-model="newUser.aphoneNumber" placeholder="01900000000"  ng-pattern="/^[0-9]{11}$/" class="form-control"  Required>
                            <span ng-show="myForm.aphoneNumber.$invalid && myForm.aphoneNumber.$dirty">Number must be  11 character</span>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input name="agreed" type="checkbox" ng-model="newUser.agreed" required>
                                <h3>CLICK ME TO SHOW</h3>
                            </label>
                        </div>
                        <button type="reset" class="btn btn-primary"> CLEAR</button>
                        <button type="submit" class="btn btn-primary "  ng-disabled="myForm.$invalid">SUBMIT</button>
                    </div>
                    Number Validation ? ==<b>{{myForm.$valid}}</b>
                    <span ng-show="myForm.$invalid">Your Number is Invalid You Cannot Submit Now</span>
                    <span ng-show="myForm.$valid">Your Number is Valid You Can Submit Now</span>
                </form>
                            
                <div style="height:450px; width:100%; margin:0px auto; background-color:forestgreen ;">
                    <div ng-hide="myCheck3" style="height:20px; margin:0px auto    width:1150px; background-color: #C52D2F"></div>
                    <form  style="height:300px; width:80%; margin: 0px auto; background-color:aquamarine ">
                        <table border="2" style="margin: 0px auto">
                            <thead>
                                <tr>
                                    <th><b>Recharge Id</b></th>
                                    <th><b>Recharge Date</b></th>
                                    <th><b>Customer Phone Number</b></th>
                                    <th><b>Recharge amount</b></th>
                                    <th><b>Agent Number</b></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="row" items="${requestScope.allRecharge}">
                                    <tr>
                                        <td>${row.id}</td>
                                        <td>${row.date}</td>
                                        <td>${row.cphoneNumber}</td>
                                        <td>${row.crechargeAmount}</td>
                                        <td>${row.aphoneNumber}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </form>
                   
                </div>
 <div ng-hide="myCheck3" style="height:20px; margin:0px auto    width:1150px; background-color: #C52D2F"></div>
            </div>


            <div ng-hide="myCheck3" style="height:20px;    width:1217px; background-color: #C52D2F"></div>
            <div ng-hide="myCheck3" style="height:40px;    width:1217px; background-color: #222">
                <div  style="height:40px; margin-left:500px; margin-top: 5px;   width:717px; background-color: #222">
                    <p style="color: #ffffff; font-size: large">&copy; All Right Reserved Online Telecom Distribution System </p>
                </div>
            </div>

        </div>
    </body>
</html>
