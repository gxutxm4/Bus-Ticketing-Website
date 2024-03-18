import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';

@Component({
  selector: 'app-bpuregistration',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './bpuregistration.component.html',
  styleUrl: './bpuregistration.component.css'
})
export class BPURegistrationComponent {

  userBackendUrl:string="http://localhost:8081";

  constructor(private http:HttpClient, private router:Router){}

  addBPUData(bpureg:NgForm){
    this.http.post(this.userBackendUrl+"/addbpu", bpureg.value).subscribe(
      bpuadded=>{
        console.log(bpuadded);
        swal("Registered Successfully");
        this.router.navigateByUrl("/bpulogin");

      },
      bpufailed=>{
        console.log("Failed");
        // this.router.navigateByUrl("/bpureg");    
      }
    )
  }

}
