import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';
import { Bookings } from '../Entity/Bookings';

@Component({
  selector: 'app-view-account',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './view-account.component.html',
  styleUrl: './view-account.component.css'
})
export class ViewAccountComponent {
  userName = localStorage.getItem("userfName");
  userBackendUrl:string="http://localhost:8081";
  userid:number = Number(localStorage.getItem("userId"));
  myBooking:Bookings[]=[];

  constructor(private http: HttpClient, private router: Router) {}

  myBookings(){
    this.http.get<Bookings[]>(this.userBackendUrl+"/getBookingbyuserId/"+this.userid).subscribe(
      booking=>{
        this.myBooking = booking;
      },
      error=>{
        swal("Error Ocurred");
      }
    )
  }

}
