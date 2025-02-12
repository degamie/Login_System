var app=angular.module('new Angular App')
app.factory('Service',function{
    admin='admin';
    password='password',
    var isAuthenticated=false;
    return{
        login:function(username,password){
            isAuthenticated=username===admin && ===password;
            return isAuthenticated;
        }
        var isAuthenticated:function(){
            return isAuthenticated;
        }
    }
});