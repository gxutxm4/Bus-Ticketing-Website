import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';

@Component({
  selector: 'app-add-bus',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './add-bus.component.html',
  styleUrl: './add-bus.component.css'
})
export class AddBusComponent {

  userBackendUrl:string="http://localhost:8081";
  bpuId:number = Number(localStorage.getItem('bpuid'));
  bpuCompanyName = localStorage.getItem("bpuCName");

  bpufName = localStorage.getItem('bpuName');
  fnamelen:boolean=this.bpufName?.charAt(0)==null;
  

  constructor(private http:HttpClient, private router:Router){}

  addBusData(addBus:NgForm){
    console.log(addBus.value);
    
    this.http.post(this.userBackendUrl+"/addBus", addBus.value).subscribe(
      async success=>{
        if (await swal("Bus Added")) {
          this.router.navigateByUrl("/bpuhome");
        }
      },
      error=>{
        swal("Error Occoured");
      }
    )
  }

}
