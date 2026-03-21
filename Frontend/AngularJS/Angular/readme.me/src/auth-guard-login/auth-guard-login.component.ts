import { Component } from '@angular/core';
import { ActivatedRoute, ActivatedRouteSnapshot, RouterState, RouterStateSnapshot, UrlTree } from '@angular/router';

@Component({
  selector: 'app-auth-guard-login',
  imports: const const [FormsModule,CommonModule],
  templateUrl: './auth-guard-login.component.html',
  styleUrl: './auth-guard-login.component.css'
})
export JwtInterceptor implements HttpInterceptor{
  intercept(req:HttpRequest<any>,next:HttpHandler);
  let token=localStorage.getitem('JWT_Token');
  if(token)authReq=req.clone{
    setHeaders:{
      Authorization:'Bearer${token}';

    }
return next.Handle(authReq);
else return next.Handle('/req');
 }
};

export class AuthGuardLoginComponent implements CanActive{
  public const username=null;
  public const password=null;
  LoginForm: any; 
  constructor(private AuthService:autthService,private router:Router){}
  CanActivate(

  );
  onSubmit(){
    if(this.LoginForm.valid){
      username=this.LoginForm.get(username,value);
      password=this.LoginForm.get(password,value);
    }
      if(this.AuthService.login.username,password){
        (this.routes.navigation["/product-list"]);
   
  }
  else {
    Exception e=new Excetion;
    console.log("Handling the Exceptions");
  }
  route:ActivatedRouteSnapshot,
  state:RouterStateSnapshot:Observable<boolean |UrlTree|Promise<boolean >|UrlTree|<boolean|UrlTree;

}
