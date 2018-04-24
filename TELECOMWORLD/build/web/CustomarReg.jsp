<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                                <li><a href="CustomarReg.jsp">SIM Packages </a></li>
                                <li><a href="CustomarReg.jsp">SIM Packages</a></li>
                                <li><a href="CustomarReg.jsp">SIM Packages</a></li>

                            </ul>

                        </li>
                        <li><a href="#">MB Package</a>
                            <ul>
                                <li><a href="CustomarReg.jsp">MB Package</a></li>
                                <li><a href="CustomarReg.jsp">MB Package</a></li>
                                <li><a href="CustomarReg.jsp">MB Package</a></li>


                            </ul>
                        </li>
                        <li><a href="CustomarReg.jsp">Offers</a> 
                            <ul>
                                <li><a href="CustomarReg.jsp">Offers</a></li>
                                <li><a href="CustomarReg.jsp">Offers</a></li>
                                <li><a href="CustomarReg.jsp">Offers</a></li>

                            </ul>
                        </li>
                        <li><a href="LogInPage.jsp">Log Out</a>
                            <ul>
                                <li><a href="LogInPage.jsp">Log Out</a></li>
                                <li><a href="LogInPage.jsp">Log Out</a></li>
                                <li><a href="LogInPage.jsp">Log Out</a></li>
                            </ul>

                        </li>
                         <li><a href="ShowAlCustlRecharge.jsp">Show All Recharge</a></li>
                    </ul>
                </div>
            </div>
        </div>


        <div  style=" margin: 0px auto;   width:1217px;">
            <div ng-hide="myCheck3" style="height:40px; margin: 0px auto;   width:1217px; background-color: #985f0d">
                <div  style="height:40px;  margin-left:100px; float:left;background-color: #1ab188">
                    <h3>CUSTOMER REGISTRATION FORM</h3></div>
                <div  style="height:40px;  margin-left:350px; float:left; background-color: #1ab188">
                    <h3>CUSTOMER RECHARGE</h3></div>
            </div>


            <div ng-app="exampleApp" id="todoPanel" class="panel" ng-controller="defaultCtrl">

                <form name="myForm"  style="width: 800px; float: left; overflow: hidden;" method="post" action="CustomarRegSublet" novalidate>
                    <div class="well">
                        <div class="form-group">
                            <label>Customer Phone Number: ${requestScope.cusInsertMassage}</label>
                            <input name="phoneNumber" type="number" ng-model="newUser.phoneNumber" placeholder="01900000000"  ng-pattern="/^[0-9]{11}$/" class="form-control"  Required>
                            <span ng-show="myForm.phoneNumber.$invalid && myForm.phoneNumber.$dirty">Number must be  11 crecter</span>
                        </div>
                        <div class="form-group">
                            <label>Recharge Amount:</label>
                            <input name="rechargeAmount" type="number" ng-model="newUser.rechargeAmount" placeholder="00"  ng-pattern="/^[0-9]{2,4}$/" class="form-control" Required >
                            <span ng-show="myForm.rechargeAmount.$invalid && myForm.rechargeAmount.$dirty">Must be Number</span>
                        </div>
                        <div class="form-group">
                            <label>Customer Full Name:</label>
                            <input name="name" type="text" ng-model="newUser.name" placeholder="your name"  ng-pattern="/^[A-Za-z -_]{3,25}$/" class="form-control" Required >
                            <span ng-show="myForm.name.$invalid && myForm.name.$dirty">Name must be 3-25 crecter</span>
                        </div>

                        <div class="form-group">
                            <label>Email:</label>
                            <input name="email" type="text" ng-model="newUser.email" placeholder="marocky@gmail.com"  ng-pattern="/^[A-Za-z]+[A-Za-z0-9_]+@[A-Za-z]{2,8}.[A-Za-z]{2,8}[A-Za-z0-9.]*$/" class="form-control" Required>
                            <span ng-show="myForm.email.$invalid && myForm.email.$dirty">Email must be  valid Form</span>
                        </div>
                        <div class="form-group">
                            <label>Date Of Birth:</label>
                            <input name="dob" type="text" ng-model="newUser.dob" placeholder="01-12-2016" ng-pattern="/^[0-9]{2}-[0-9]{2}-[0-9]{4}$/" class="form-control" Required>
                            <span ng-show="myForm.dob.$invalid && myForm.dob.$dirty">Date Of Birth must be Like 01-12-2016</span>
                        </div>
                        <div class="form-group">
                            <label>Permanent Address:</label>
                            <input name="address" type="text" ng-model="newUser.address" placeholder="Your permanent address" ng-pattern="/^[A-Za-z0-9_-/|\.:, #]{3,120}$/" class="form-control" Required>
                            <span ng-show="myForm.address.$invalid && myForm.address.$dirty">Permanent Address Required</span>
                        </div>
                        <div class="form-group">
                            <label>Occupation:</label>
                            <input name="occupation" type="text" ng-model="newUser.occupation" placeholder="Occupation" ng-pattern="/^[A-Za-z -_]{3,25}$/" class="form-control" Required>
                            <span ng-show="myForm.occupation.$invalid && myForm.occupation.$dirty">Occupation  Required</span>
                        </div>
                        <div class="form-group">
                            <label>Contract Number:</label>
                            <input name="altNumber" type="number" ng-model="newUser.altNumber" placeholder="01900000000"  ng-pattern="/^[0-9]{11}$/" class="form-control" Required >
                            <span ng-show="myForm.altNumber.$invalid && myForm.altNumber.$dirty">Number must be  11 crecter</span>
                        </div>

                        <div class="checkbox">
                            <label>
                                <input name="agreed" type="checkbox" ng-model="newUser.agreed" required>
                                I agree with this condition
                            </label>
                        </div>
                        <button type="reset" class="btn btn-primary">
                            CLEAR
                        </button>
                        <button type="submit" class="btn btn-primary "  ng-disabled="myForm.$invalid">
                            SUBMIT
                        </button>
                    </div>
                    Form Validation ? ==<b>{{myForm.$valid}}</b>
                    <span ng-show="myForm.$invalid">Your Form is Invalid You Cannot Submit Now</span>
                    <span ng-show="myForm.$valid">Your Form is Valid You Can Submit Now</span>

                </form>
                <form name="myForm2"  style="width: 360px; float: left; overflow: hidden;" method="post" action="CusrechargrSublet" novalidate>
                    <div class="well">
                        <div class="form-group">
                            <label>Customer Phone Number:</label>
                            <input name="cphoneNumber" type="number" ng-model="newUser.cphoneNumber" placeholder="01900000000"  ng-pattern="/^[0-9]{11}$/" class="form-control"  Required>
                            <span ng-show="myForm.cphoneNumber.$invalid && myForm.phoneNumber.$dirty">Number must be  11 character</span>
                        </div>
                        <div class="form-group">
                            <label>Recharge Amount:</label>
                            <input name="crechargeAmount" type="number" ng-model="newUser.crechargeAmount" placeholder="00"  ng-pattern="/^[1-9]+[0-9]+$/" class="form-control" Required >
                            <span ng-show="myForm.crechargeAmount.$invalid && myForm.rechargeAmount.$dirty">Must be Number</span>
                        </div>
                        <div class="form-group">
                            <label>AGENT Number:</label>
                            <input name="aphoneNumber" type="number" ng-model="newUser.aphoneNumber" placeholder="01900000000"  ng-pattern="/^[0-9]{11}$/" class="form-control"  Required>
                            <span ng-show="myForm.aphoneNumber.$invalid && myForm.phoneNumber.$dirty">Number must be  11 character</span>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input name="IsAgreed" type="checkbox" ng-model="newUser.IsAgreed" required>
                                ALL INFORMATION IS CORRECT ?
                            </label>
                        </div>
                        <button type="reset" class="btn btn-primary">
                            CLEAR
                        </button>
                        <button type="submit" class="btn btn-primary "  ng-disabled="myForm2.$invalid">
                            SUBMIT
                        </button>
                    </div>
                    Form Validation ? ==<b>{{myForm2.$valid}}</b>

                    <div> RECHARGE MASSAGE= ${requestScope.cusRechargeMassage}</div>
                </form>        

            </div>
        </div>

    </body>
</html>