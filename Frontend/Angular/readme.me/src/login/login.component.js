var app=angular.module('MyLoginPAge','ui'.'router');
app.run(function($rootScope,$location,$state,LoginTest));
console.clear();
console.log("executing Login  Page");
if(!LoginTest.isAuthenticated()){
  $state.TransitionTo("Login");
}
$scope.formSubmit=function(){
  if(LoginService.login){
    ($scope.username,$scope.password);
    $rootScope.username=username;
  }
    $scope.error='';
    $scope.username='';
    $scope.password='';
    $state.TransitionTo('mainPage');

  else{
    $scope.error('Incorrect Credentialis');
  }
}
