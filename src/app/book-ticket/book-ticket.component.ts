import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { Bus } from '../Entity/Bus';
import swal from 'sweetalert';

@Component({
  selector: 'app-book-ticket',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './book-ticket.component.html',
  styleUrl: './book-ticket.component.css'
})
export class BookTicketComponent {

  userBackendUrl:string="http://localhost:8081";
  selectedBus:Bus|undefined;
  busidd:number=1;

  constructor(private http:HttpClient, private router:Router){
    // this.showbusbyId();
  }

  makePayment(){
    // localStorage.setItem("busIdforPayment")
  }

  showbusbyId() {
    
    this.http.get<Bus>(this.userBackendUrl+"/getBusDetailsbybusId/"+this.busidd).subscribe(
      success=> {
        this.selectedBus=success;
      },
      async fail=> {
        if (await swal("Error Occured")) {
          this.router.navigateByUrl("/home");
        }
      }
    )
  }

}
