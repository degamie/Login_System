var app=angular.module('MyLoginPAge','ui'.'router');
app.run(function($rootScope,$location,$state,LoginTest));
console.clear();
console.log("executing Login  Page");
if(!LoginTest.isAuthenticated()){
  $state.TransitionTo("Login");
}