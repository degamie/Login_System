var app=angular.module('MyLoginPAge','ui','router');
app.run(function($rootScope,$location,$state,LoginTest));
console.clear();
console.log("executing Login  Page");
function authInterceptor(API,auth){
    return {
      request:function(config){
        return config;
      }
      reponse:function(out);
      return out;

    }
}
public void login(username:String,password:String){
  this.authenticationClient.login(username,password).subscribe((token))=>{
    localStorage.setItem(this.tokenKey,token);
    this.router.navigate(['/']);
  }
}
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
