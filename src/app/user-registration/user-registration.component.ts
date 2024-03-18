import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { Userreg } from '../Entity/Userreg';
import { FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';

@Component({
  selector: 'app-user-registration',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './user-registration.component.html',
  styleUrl: './user-registration.component.css'
})
export class UserRegistrationComponent {
  
  // userregi:Userreg|undefined;
  userBackendUrl:string="http://localhost:8081";

  constructor(private http:HttpClient, private router:Router){}

  addData(userreg:NgForm) {
    this.http.post(this.userBackendUrl+"/add", userreg.value).subscribe(
      async success=>{
        console.log(success);
        if (await swal("Data Added")) {
          this.router.navigateByUrl('/userlogin');
        }

      },
      error=>{
        swal("Error Occured");
        this.router.navigateByUrl('/userreg');
      }
    )
  }

}
