import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';
import { Bus } from '../Entity/Bus';

@Component({
  selector: 'app-user-payment',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './user-payment.component.html',
  styleUrl: './user-payment.component.css'
})
export class UserPaymentComponent {
  userBackendUrl:string="http://localhost:8081/";
  userid = localStorage.getItem("userId");
  busId = Number(localStorage.getItem("buSID"))*1;
  st:number = 10;
  busSource:string|undefined;
  busDest:string|undefined;
  bus:Bus={
    busId: 101,
    bpuId: 0,
    busNo: '',
    bpuCompanyName: '',
    busSource: '',
    busDestination: '',
    busFare: 0,
    busDeparturetime: {
      hours: 0,
      minutes: 0
    },
    busArrivalTime: {
      hours: 0,
      minutes: 0
    },
    busTotalSeats: 0,
    busPillow: false,
    busCCTV: false,
    busCharging: false,
    busPickupPoints: [],
    busDropPoints: []
  };

  constructor(private http:HttpClient, private router:Router){
    this.bookticket();
  }

  bookticket(){
    this.http.get<Bus>(this.userBackendUrl+"getBusDetailsbybusId/"+localStorage.getItem("buSID")).subscribe(
      buses=>{
        console.log(localStorage.getItem("buSID"));
        console.log(typeof(this.busId));
                
        console.log("Gautam");
        console.log(buses);
        this.bus = buses;        
      },
      error=>{
        swal("Some Error Occured. Redirecting to you to Home Page");
      }
    )
  }

  bookticketpay(){
    swal("Ticket Booked");
  }

}
