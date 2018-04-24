<%-- 
    Document   : RestFullCustom
    Created on : Dec 29, 2016, 12:10:08 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <link rel="stylesheet" href="recorces/css/bootstrap.min.css" />
        <script src="resources/angular.js"></script>

        <title>AngularJS $http Restfull Example</title>  
        <script src="resources/myangular.js" type="text/javascript"></script>
        <style>
             body{background:url(img/backgroung.png)repeat}
        </style>
    </head>
    <body ng-app="simpleApp" ng-controller="simpleCtrl">
        <div class="container">
<!--            <h1>
             ROCK HTTP AngularJS Restful Web Services 
            </h1> -->
            <div ng-hide="myCheck3" style="height:40px; margin: 0px auto;   width:950px; background-color: #FC4A4A">
                <div  style=" margin-left:100px; width: 750px; background: #4cae4c"> <h1> Rock  HTTP AngularJS Restful Web Services</h1></div>
            </div>


            
            <div class="row">
                <div style="background-color: #ce8483" class="col-sm-12"> 
                    <input type="button" value="{{customars.length}}" class="btn btn-success btn-lg" />
                  ----------*------------*-----------*---------*-----------*
                   <a href="AgentReg.jsp">Agent Reg</a>----------*------------
                    <a href="LogInPage.jsp">Log Out</a>----------*------------
                    <a href="index.jsp">HOME</a>----------*------------*-----------*
                    
                    <form class="form-horizontal" ng-submit="submitSimple()">
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Customer Phone Number</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.phoneNumber"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Customer Recharge Amount</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.rechargeAmount"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Customer Name</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.name"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Customer Email</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.email"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Date Of Birth</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.dob"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Customer Address</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.address"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Customer Occupation</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.occupation"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-4" >Alternative Phone Number</label>
                            <div class="col-sm-7">
                                <input class="form-control" ng-model="simpleForm.altNumber"  />
                            </div>
                        </div>


                        <input type="submit" value="Submit" class="btn btn-success btn-lg" />


                </div>
                 
                <div style="background-color: #eed3d7" class="col-sm-12">
                    <div ng-hide="myCheck3" style="height:20px; margin:0px auto    width:1150px; background-color: #C52D2F"></div>
                    <table border="1" class="table">
                        <tr>

                            <th>Phone Number</th>
                            <th>Amount</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Date Of Birth</th>
                            <th>Address</th>
                            <th>Occupation</th>
                            <th>Alt Number</th>
                            <th>ACTION</th>

                        </tr>

                        <tr ng-repeat="customar in customars">
                            <td> {{ customar.phoneNumber}}</td>
                            <td> {{ customar.rechargeAmount}}</td>
                            <td >{{ customar.name}}</td>
                            <td> {{ customar.email}}</td>
                            <td> {{ customar.dob}}</td>
                            <td >{{ customar.address}}</td> 
                            <td> {{ customar.occupation}}</td>
                            <td >{{ customar.altNumber}}</td>

                            <td><a ng-click="editSimple(customar)" class="blue-button">Update</a> | <a ng-click="deleteSimple(customar)" class="red-button">Delete</a></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>





    </body>
</html>
