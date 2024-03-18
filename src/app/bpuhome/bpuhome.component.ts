import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { Bus } from '../Entity/Bus';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';
import { BusLT } from '../Entity/BusLT';

@Component({
  selector: 'app-bpuhome',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './bpuhome.component.html',
  styleUrl: './bpuhome.component.css'
})
export class BPUHomeComponent {
  buses:Bus[]=[];
  busdeletion:Bus|undefined;
  showdelete:boolean=false;
  
  bpuId:number = Number(localStorage.getItem('bpuid'));

  userBackendUrl:string="http://localhost:8081";
  bpuName=localStorage.getItem("bpuName");
  bpuNamelen:boolean=this.bpuName?.charAt(0)==null;
  BusNo:string="";
  

  constructor(private http:HttpClient, private router:Router){}

  addBus(){
    this.router.navigateByUrl("/addbus");
  }

  showBuses(){
    this.http.get<Bus[]>(this.userBackendUrl+"/getBusDetailsbybpuId/"+this.bpuId).subscribe(
      success=>{
        this.buses = success;
      },
      error=>{
        swal("Error Ocurred");
      }
    )
  }

  showbusbyBusNo(){
    this.http.get<Bus>(this.userBackendUrl+"/deleteBusbyBusNo/"+this.BusNo).subscribe(
      deleted=>{
        this.busdeletion=deleted;
      },
      error=>{
        swal("Error Ocurred");
      }
    )
  }

  showdeleteBus(){
    this.showdelete=true;
  }

  deleteBus(){
    // this.showbusbyBusNo();
    if(this.busdeletion!=null){
      this.http.delete(this.userBackendUrl+"/deleteBusbyBusNo/"+this.BusNo).subscribe(
        deleted=>{
          swal("Bus Deleted");
        },
        error=>{
          swal("Error Ocurred");
        }
      )
    }
  }

  bpulogout(){
    window.localStorage.clear();
    this.router.navigateByUrl("/home");
  }
}
