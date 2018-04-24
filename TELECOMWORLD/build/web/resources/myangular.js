var app = angular.module("simpleApp", []);

app.controller("simpleCtrl", function ($scope, $http) {


    $scope.customars = [];
    $scope.simpleForm = {
        phoneNumber: -1,
        rechargeAmount: 0,
        name: "",
        email: "",
        dob: "",
        address: "",
        occupation: "",
        altNumber: 0
    };

    _refreshSimpleData();

    $scope.submitSimple = function () {

        var method = "";
        var url = "";
        if ($scope.simpleForm.phoneNumber != -1) {
            method = "POST";
            url = 'http://localhost:8080/TELECOMWORLD/restful/customer';
        } 
        else {

            method = "PUT";
            url = 'http://localhost:8080/TELECOMWORLD/restful/customer/' + $scope.simpleForm.phoneNumber;
        }

        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.simpleForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    //HTTP DELETE- delete Message by Id
    $scope.deleteSimple = function (customar) {
        $http({
            method: 'DELETE',
            url: 'http://localhost:8080/TELECOMWORLD/restful/customer/' + customar.phoneNumber
        }).then(_success, _error);
    };

    $scope.editSimple = function (customar) {
        $scope.simpleForm.phoneNumber = customar.phoneNumber,
                $scope.simpleForm.rechargeAmount = customar.rechargeAmount,
                $scope.simpleForm.name = customar.name,
                $scope.simpleForm.email = customar.email,
                $scope.simpleForm.dob = customar.dob,
                $scope.simpleForm.address = customar.address,
                $scope.simpleForm.occupation = customar.occupation,
                $scope.simpleForm.altNumber = customar.altNumber
    };

    function _refreshSimpleData() {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/TELECOMWORLD/restful/customer'
        }).then(function successCallback(response) {
            $scope.customars = response.data;
            console.log(response.data);
        }, function errorCallback(response) {
            console.log(response.statusText);
        });
    }

    function _success(response) {
        _refreshSimpleData();
        _clearFormData()
    }

    function _error(response) {
        console.log(response.statusText);
    }


    function _clearFormData() {
        $scope.simpleForm.phoneNumber = -1,
                $scope.simpleForm.rechargeAmount = 00,
                $scope.simpleForm.name = "",
                $scope.simpleForm.email = "",
                $scope.simpleForm.dob = "",
                $scope.simpleForm.address = "",
                $scope.simpleForm.occupation = "",
                $scope.simpleForm.altNumber = 00
    }
    ;

});