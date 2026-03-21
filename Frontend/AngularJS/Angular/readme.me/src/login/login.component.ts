//WID(21/03/2026)(Sartak Mittal)#1
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
  startInput=(username,Password)=>{
      return username+Password;}
}
    // username!: string;
    // Password!: string;


