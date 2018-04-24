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
                        <li><a href="index.html" style="background:#C52D2F">Home</a></li>
                        <li><a href="#">SIM Packages</a>
                            <ul>
                                <li><a href="logInPage.jsp">SIM Packages </a></li>
                                <li><a href="logInPage.jsp">SIM Packages</a></li>
                                <li><a href="logInPage.jsp">SIM Packages</a></li>

                            </ul>

                        </li>
                        <li><a href="#">MB Package</a>
                            <ul>
                                <li><a href="logInPage.jsp">MB Package</a></li>
                                <li><a href="logInPage.jsp">MB Package</a></li>
                                <li><a href="logInPage.jsp">MB Package</a></li>


                            </ul>
                        </li>
                        <li><a href="logInPage.jsp">Offers</a> 
                            <ul>
                                <li><a href="logInPage.jsp">Offers</a></li>
                                <li><a href="logInPage.jsp">Offers</a></li>
                                <li><a href="logInPage.jsp">Offers</a></li>

                            </ul>
                        </li>
                        <li><a href="logInPage.jsp">Log In</a>
                            <ul>
                                <li><a href="logInPage.jsp">Log In</a></li>
                                <li><a href="logInPage.jsp">Log In</a></li>
                                <li><a href="logInPage.jsp">Log In</a></li>
                            </ul>

                        </li>
                       
                    </ul>
                </div>
            </div>
        </div>


        <div  style=" margin: 0px auto;   width:1217px;">
            <div ng-hide="myCheck3" style="height:40px; margin: 0px auto;   width:1217px; background-color: #985f0d">
                <div  style=" margin-left:400px;"> <h3>PLEASE LOG IN FOR SERVICE</h3></div>
            </div>


            <div ng-app="exampleApp" id="todoPanel" class="panel" ng-controller="defaultCtrl">

                <form name="myForm" style="width: 500px; margin: 0px auto" method="post" action="LoginTest.jsp" novalidate>
                    <div class="well">
                        <div class="form-group">
                            <label>Phone Number:</label>
                            <input name="phoneNumber" type="number" ng-model="newUser.phoneNumber" placeholder="01900000000"  ng-pattern="/^[0-9]{11}$/" class="form-control"  Required>
                            <span ng-show="myForm.phoneNumber.$invalid && myForm.phoneNumber.$dirty">Number must be  11 character</span>
                        </div>
                        <div class="form-group">
                            <label>Email:</label>
                            <input name="email" type="text" ng-model="newUser.email" placeholder="marocky@gmail.com"  ng-pattern="/^[A-Za-z]+[A-Za-z0-9_]+@[A-Za-z]{2,8}.[A-Za-z]{2,8}[A-Za-z0-9.]*$/" class="form-control" Required>
                            <span ng-show="myForm.email.$invalid && myForm.email.$dirty">Email must be  valid Form</span>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input name="agreed" type="checkbox" ng-model="newUser.agreed" required>
                                <h5>CLICK ME TO LOG IN</h5>
                            </label>
                        </div>
                        <button type="reset" class="btn btn-primary"> CLEAR</button>
                        <button type="submit" class="btn btn-primary "  ng-disabled="myForm.$invalid">LOG IN</button>
                    </div>
                    Number Validation ? ==<b>{{myForm.$valid}}</b>
                    <span ng-show="myForm.$invalid">Your Number is Invalid You Cannot Submit Now</span>
                    <span ng-show="myForm.$valid">Your Number is Valid You Can Submit Now</span>
                </form>


                <div ng-hide="myCheck3" style="height:20px; margin:0px auto    width:1150px; background-color: #C52D2F"></div>
            </div>



            <div ng-hide="myCheck3" style="height:40px;    width:1217px; background-color: #222">
                <div  style="height:40px; margin-left:500px; margin-top: 5px;   width:717px; background-color: #222">
                    <p style="color: #ffffff; font-size: large">&copy; All Right Reserved Online Telecom Distribution System </p>
                </div>
            </div>

        </div>
    </body>
</html>
