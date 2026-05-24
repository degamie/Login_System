//WID(24/04/2026)(Sarthak Mittal)(DegameiSign)#1
import { CommonModule } from '@angular/common';
import { Component, NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login';
  imports: [FormsModule,CommonModule],
  // templateUrl: './login.component.html',
  styleUrl: './login.component.css';
})

export class LoginComponent implements OnInit {
  loginForm:FormGroup;
  loginUr:string=" ";
  login();
  const router=inject(Router);
}
    // username!: string;
    // Password!: string;


