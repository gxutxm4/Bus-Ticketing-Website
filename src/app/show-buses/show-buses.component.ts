import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, Injectable } from '@angular/core';
import { FormsModule, NgModel, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { Bus } from '../Entity/Bus';
import swal from 'sweetalert';

@Component({
  selector: 'app-show-buses',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './show-buses.component.html',
  styleUrl: './show-buses.component.css'
})

export class ShowBusesComponent {
  userBackendUrl:string="http://localhost:8081";
  buses:Bus[]=[];
  selectedbusid:number|undefined;
  
  constructor(private http:HttpClient, private router:Router){
    this.findBuses();
  }


  findBuses(){
    this.http.get<Bus[]>(this.userBackendUrl+"/getbySourceandDestination/"+localStorage.getItem("busSource")+"/"+localStorage.getItem("busDest")).subscribe(
      found=>{
        // console.log(found);
        if(found.length==0){
          swal("No Buses Found");
          this.router.navigateByUrl("/home");
        } else{
          this.buses = found;
          // console.log(found[0].bpuCompanyName);
          
        } 
      },
      async notfound=>{
        if (await swal("Error Ocurred")) {
          
        }
        this.router.navigateByUrl("/home");
      }
    )
  }

  bookticket(busid:Bus){
    // localStorage.setItem("busid", );
    // console.log(this.selectedbusid);
    // console.log(busid);
    localStorage.setItem("buSID", busid.busId.toString());   
    this.router.navigateByUrl("/userpayment");
    
  }

}
