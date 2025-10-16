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
}
    // username!: string;
    // Password!: string;


