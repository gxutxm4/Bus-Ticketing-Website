import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { BPUser } from '../Entity/BPUser';
import swal from 'sweetalert';

@Component({
  selector: 'app-bpulogin',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './bpulogin.component.html',
  styleUrl: './bpulogin.component.css'
})
export class BPULoginComponent {

  userBackendUrl:string="http://localhost:8081";
  BPUuserame:string="";
  BPUPassword:string="";

  constructor(private http:HttpClient, private router:Router){}

  validateBPUser(){

    this.http.get<BPUser>(this.userBackendUrl+"/validateBPUser/"+this.BPUuserame+"/"+this.BPUPassword).subscribe(
      async validated => {
        if (validated == null) {
          swal("Wrong Credentials");
        } else {
          localStorage.setItem("bpuName", validated.bpufName);
          localStorage.setItem("bpuid", validated.bpuId.toString());
          localStorage.setItem("bpuCName", validated.bpuCompanyName);
          console.log(validated);
          
          // swal("Login Succesfully");
          if(await swal("Login Succesfully")){
            this.router.navigateByUrl('/bpuhome');
          }
        }
      },
      wrong => {
        console.log("Error");
        this.router.navigateByUrl('/userlogin');
      }
    )
    
  }
}
