import { Component } from '@angular/core';
import { ActivatedRoute, ActivatedRouteSnapshot, RouterState, RouterStateSnapshot, UrlTree } from '@angular/router';

@Component({
  selector: 'app-auth-guard-login',
  imports: [],
  templateUrl: './auth-guard-login.component.html',
  styleUrl: './auth-guard-login.component.css'
})
export class AuthGuardLoginComponent implements CanActive{ 
  CanActivate(

  );
  route:ActivatedRouteSnapshot,
  state:RouterStateSnapshot:Observable<boolean |UrlTree|Promise<boolean >|UrlTree|<boolean|UrlTree;

}
