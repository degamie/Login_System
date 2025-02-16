var app=angular.module('new Angular App')
app.factory('Service'){
    // Boolean isAuthenticated=false;
    admin='admin';
    password='password',
    //  isAuthenticated=false;
    return{
        login:function(username,password){
            isAuthenticated=username===admin && password===password;
            return isAuthenticated;
        }
        // isAuthenticatedlogin:function(username,password){
        //     console.log(isAuthenticated);
        // }
    }
};