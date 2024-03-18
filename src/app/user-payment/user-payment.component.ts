import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';

@Component({
  selector: 'app-user-payment',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './user-payment.component.html',
  styleUrl: './user-payment.component.css'
})
export class UserPaymentComponent {
  userBackendUrl:string="http://localhost:8081";
  userid = localStorage.getItem("userId");

  constructor(private http:HttpClient, private router:Router){}

  bookticket(){

    // this.http.post(this.userBackendUrl, ).subscribe(
    //   booked=>{
    //     swal
    //   },
    //   error=>{}
    // )
  }
}
