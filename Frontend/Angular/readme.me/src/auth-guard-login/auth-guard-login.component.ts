import { Component } from '@angular/core';
import { ActivatedRoute, ActivatedRouteSnapshot, RouterState, RouterStateSnapshot, UrlTree } from '@angular/router';

@Component({
  selector: 'app-auth-guard-login',
  imports: const [FormsModule,CommonModule],
  templateUrl: './auth-guard-login.component.html',
  styleUrl: './auth-guard-login.component.css'
})
export class AuthGuardLoginComponent implements CanActive{ 
  constructor(private AuthService:autthService,private router:Router){}
  CanActivate(

  );
  route:ActivatedRouteSnapshot,
  state:RouterStateSnapshot:Observable<boolean |UrlTree|Promise<boolean >|UrlTree|<boolean|UrlTree;

}
