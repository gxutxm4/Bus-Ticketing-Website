import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { Userreg } from '../Entity/Userreg';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';
import swal from 'sweetalert';

@Component({
  selector: 'app-user-login',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './user-login.component.html',
  styleUrl: './user-login.component.css'
})
export class UserLoginComponent {

  userregi: Userreg | undefined;
  userBackendUrl: string = "http://localhost:8081";
  userID: string = "";
  userPass: string = "";
  // loginForm:FormGroup = new FormGroup({
  //   userID:new FormControl(''),
  // userPass:new FormControl('')
  // })

  constructor(private http: HttpClient, private router: Router) { }
  
  validateUser() {

    this.http.get<Userreg>(this.userBackendUrl + "/validateuserReg/" + this.userID + "/" + this.userPass).subscribe(
      async validated => {
        // localStorage.setItem("userNAME", this.userID);
        let temp: Userreg = validated;
        console.log(temp);
        if (temp == null) {
          swal("Wrong Credentials");
        } else {
          // console.log(validated);
          localStorage.setItem("userfName", validated.userfName);
          localStorage.setItem("userId", validated.userId.toString());
          if (await swal("Login Successfully!!")) {
            this.router.navigateByUrl('/home');
            // window.location.reload();
          }
        }
      },
      wrong => {
        console.log("Error");
        this.router.navigateByUrl('/userlogin');
      }
    )
    
    let userfName = localStorage.getItem("userfName");
  }
}
