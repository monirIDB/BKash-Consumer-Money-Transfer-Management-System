<%-- 
    Document   : index
    Created on : Jan 2, 2017, 10:21:51 AM
    Author     : lenovo
--%>

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

        <!--        angular resorces-->
        <script src="resources/angular.min.js"></script>
        <script src="resources/angular-animate.js"></script>
        <script src="resources/angular.js"></script> 
        <script src="resources/angular-route.js"></script>
        <!--              parsonal stylesheet-->
        <link rel="stylesheet" type="text/css" href="recorces/css/style.css">
        <style>
            .carousel-inner > .item > img,
            .carousel-inner > .item > a > img {
                width: 80%;
                height: 450px;
                margin: auto;
            }
            body{background:url(img/backgroung.png)repeat}

            .ng-hide {
                height: 0;
                width: 0;
                background-color: transparent;
                top:-200px;
                left: 200px;
            }
        </style>
        <script>
            var app = angular.module("ngAnimate", ["ngRoute"]);
            app.config(function ($routeProvider) {
                $routeProvider
                        .when("/", {
                            templateUrl: "MarkForm.jsp"
                        })
                        .when("/london", {
                            templateUrl: "ShowResult.jsp"
                        })
                        .when("/paris", {
                            templateUrl: "ParsonalInfo.jsp"
                        });
            });
        </script>
    </head>
    <body >
        <div class="header_area fix">
            <!--             <h4 style="color: #e7e7e7;">WELCOME...</h4>-->
            <div style="background: #0054A5" class="main">

                <div  class="header fix">

                    <div  class="phone fix">

                        <p><i class="fa fa-phone-square" aria-hidden="true"></i>
                            +88 02 9661900   &nbsp; Fax:  +88 02 9667222   &nbsp;
                            <i class="fa fa-envelope" aria-hidden="true"></i>

                        </p>
                    </div>
                    <div class="social fix">
                        <p>
                            <a href="https://www.facebook.com/"> <img src="img/fb.PNG" /></a>
                            <a href="https://twitter.com/login"> <img src="img/tt.PNG" /></a>
                            <a href="https://www.youtube.com/"> <img src="img/ut.PNG" /></a>
                        </p>
                        <p>
                        </p>
                    </div>
                    <div class="Sherce_box fix">
                        <form>
                            Search :
                            <input class="Src_box" type="text" style="height:20px" name="keyword">
                            <input class="bodytext" type="button" src="images/search.gif" name="Go" value="go" alt="Go!">
                        </form>
                    </div>
                </div>
            </div>
        </div>


        <div class="menu_area fix">
            <div class="main">
                <div class="logo">
                    <img src="img/logo.PNG" />
                </div>
                <div class="main_menu">
                    <ul>
                        <li><a href="index.jsp" style="background:#C52D2F">Home</a></li>
                        <li><a href="index.jsp">SIM Packages</a>
                            <ul>
                                <li><a href="index.jsp">SIM Packages</a></li>
                                <li><a href="index.jsp">SIM Packages</a></li>
                                <li><a href="index.jsp">SIM Packages</a></li>

                            </ul>

                        </li>
                        <li><a href="#">MB Package</a>
                            <ul>
                                <li><a href="index.jsp">MB Package</a></li>
                                <li><a href="index.jsp">MB Package</a></li>
                                <li><a href="index.jsp">MB Package</a></li>


                            </ul>
                        </li>
                        <li><a href="index.jsp">Offers</a> 
                            <ul>
                                <li><a href="index.jsp">Offers</a></li>
                                <li><a href="index.jsp">Offers</a></li>
                                <li><a href="index.jsp">Offers</a></li>

                            </ul>
                        </li>
                        <li><a href="LogInPage.jsp">Log In</a>
                            <ul>
                                <li><a href="LogInPage.jsp">Log In</a></li>
                                <li><a href="LogInPage.jsp">Log In</a></li>
                                <li><a href="LogInPage.jsp">Log In</a></li>
                            </ul>

                        </li>
                       
                    </ul>
                </div>
            </div>
        </div>






        <div ng-app="ngAnimate">
            <div ng-hide="myCheck3" style="height:30px; margin-left:400px;   width:817px; ">
            <h5>
                <b>LOCATION:<b/> <input type="checkbox" ng-model="myCheck">
                <b>CUSTOMER CARE:<b/> <input type="checkbox" ng-model="myCheck2">
                 <b>HOME:<b/> <input type="checkbox" ng-model="myCheck">
            </h5>
            </div>
                        <div ng-hide="myCheck" data-interval="500" style="width: 90%; margin: 20px auto" id="myCarousel" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel" data-slide-to="1"></li>
                                <li data-target="#myCarousel" data-slide-to="2"></li>
                                <li data-target="#myCarousel" data-slide-to="3"></li>
                                <li data-target="#myCarousel" data-slide-to="4"></li>
                                <li data-target="#myCarousel" data-slide-to="5"></li>
                                <li data-target="#myCarousel" data-slide-to="6"></li>
                                <li data-target="#myCarousel" data-slide-to="7"></li>
                                <li data-target="#myCarousel" data-slide-to="8"></li>
                            </ol>

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner" role="listbox">
                                <div class="item active">
                                    <img src="img/p1.jpg" alt="Chania">
                                </div>

                                <div class="item">
                                    <img src="img/p2.jpg" alt="Chania">
                                </div>

                                <div class="item">
                                    <img src="img/p3.jpg" alt="Flower">
                                </div>

                                <div class="item">
                                    <img src="img/p4.jpg" alt="Flower">
                                </div>

                                <div class="item">
                                    <img src="img/p5.jpg" alt="Flower">
                                </div>
                                <div class="item">
                                    <img src="img/p6.jpg" alt="Chania">
                                </div>

                                <div class="item">
                                    <img src="img/p7.jpg" alt="Flower">
                                </div>

                                <div class="item">
                                    <img src="img/p8.jpg" alt="Flower">
                                </div>

                                <div class="item">
                                    <img src="img/p9.jpg" alt="Flower">
                                </div>
                            </div>

                            <!-- Left and right controls -->
                            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                        <div ng-hide="myCheck2" style="height:500px; margin-left:66px;   width:1217px; background-color: #9d9d9d">
                            <div style="height:100%; float: left; overflow: hidden;    width:70%; background-color: #1ab188">
                                <a href="#"> <img height="100%" width="95%" src="img/location.jpg" /></a>
                            </div>      

                            <div style="height:100%; float: left; overflow: hidden;   width:30%; ">
                                <div style="height:34px; float: left; overflow: hidden;   width:1000%;">
                                    <span style="text-align: center; margin-left: 80px;  color: #C52D2F"><b>Show GooGle Location</b></span>
                                </div> 
                                <div style="height:132px; float: left; overflow: hidden;   width:1000%; background-color: #1ab188">
                                    <a href="https://www.google.com.bd/maps/place/%E0%A6%AC%E0%A6%BE%E0%A6%82%E0%A6%B2%E0%A6%BE%E0%A6%B2%E0%A6%BF%E0%A6%82%E0%A6%95+%E0%A6%95%E0%A6%BE%E0%A6%B8%E0%A7%8D%E0%A6%9F%E0%A6%AE%E0%A6%BE%E0%A6%B0+%E0%A6%95%E0%A7%87%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%B0/@23.7255424,90.410247,14z/data=!4m5!3m4!1s0x3755b85026a8cb97:0x3d21933290a6a8d2!8m2!3d23.7251207!4d90.4217549?hl=bn"> <img height="132px" width="365px" src="img/gmap1.jpg" /></a>
                                </div> 
                                <div style="height:34px; float: left; overflow: hidden;   width:1000%; ">
                                    <span style="text-align: center; margin-left: 80px;  color: #C52D2F"><b>Show GooGle Earth</b></span>
                                </div> 
                                <div style="height:132px; float: left; overflow: hidden;   width:1000%; background-color: #C52D2F">
                                    <a href="https://www.google.com.bd/maps/place/%E0%A6%AC%E0%A6%BE%E0%A6%82%E0%A6%B2%E0%A6%BE%E0%A6%B2%E0%A6%BF%E0%A6%82%E0%A6%95+%E0%A6%95%E0%A6%BE%E0%A6%B8%E0%A7%8D%E0%A6%9F%E0%A6%AE%E0%A6%BE%E0%A6%B0+%E0%A6%95%E0%A7%87%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%B0/@23.722875,90.4150687,2851m/data=!3m1!1e3!4m5!3m4!1s0x3755b85026a8cb97:0x3d21933290a6a8d2!8m2!3d23.7251207!4d90.4217549?hl=bn"> <img height="132px" width="365px" src="img/gmap2.jpg" /></a>
                                </div> 
                                <div style="height:34px; float: left; overflow: hidden;   width:1000%; ">
                                    <span style="text-align: center; margin-left: 80px;  color: #C52D2F"><b>Show  Street View</b></span>
                                </div> 
                                <div style="height:132px; float: left; overflow: hidden;   width:1000%; background-color: #9d9d9d">
                                    <a href="https://www.google.com.bd/maps/@23.7250983,90.4216179,3a,75y,15.85h,84.76t/data=!3m6!1e1!3m4!1ss1I4tcIA0WTv5fcvJAcV5A!2e0!7i13312!8i6656!6m1!1e1?hl=bn"> <img height="132px" width="365px" src="img/gmap3.jpg" /></a>
                                </div> 
                            </div>      
                        </div> 
            <div ng-hide="myCheck3" style="height:20px; margin-left:66px;   width:1217px; background-color: #C52D2F"></div>
            <div ng-hide="myCheck3" style="height:500px; margin-left:66px;   width:1217px; background-color: #9d9d9d">
                
                <a href="https://www.google.com.bd/maps/search/banglalink+all+customer+care+/@23.7489897,90.3473381,12.25z?hl=bn"> <img height="500px" width="1217px" src="img/cuscare.jpg" /></a>
            </div>
            <div ng-hide="myCheck3" style="height:40px; margin-left:66px;   width:1217px; background-color: #222">
               
                        <div  style="height:40px; margin-left:500px; margin-top: 5px;   width:717px; background-color: #222">
                            <p style="color: #ffffff; font-size: large">&copy; All Right Reserved Online Telecom Distribution System </p>
                        </div>
                    </div>
            </div>
                        </div>
                        </body>
                        </html>