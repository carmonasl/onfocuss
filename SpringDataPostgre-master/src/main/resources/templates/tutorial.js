
//$http.get(url, {responseType: "arraybuffer"})
//    .success(function(data) {
//        $scope.image= data;
//    }
//)

var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("http://localhost:8081/tutorialMock/?uri=randomUri").then(function (response) {
        $scope.myData = response.data;
    });
});