import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { Bus } from '../Entity/Bus';
import swal from 'sweetalert';

@Component({
  selector: 'app-home-page',
  standalone: true,
  imports: [HttpClientModule, FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './home-page.component.html',
  styleUrl: './home-page.component.css'
})
export class HomePageComponent {

  userBackendUrl:string="http://localhost:8081";
  source:string="";
  dest:string="";
  fname=localStorage.getItem("userfName");
  fnamelen:boolean=this.fname?.charAt(0)==null;


  constructor(private http:HttpClient, private router:Router){}

  findBuses(){
    localStorage.setItem("busSource", this.source);
    localStorage.setItem("busDest", this.dest);
    this.router.navigateByUrl("/showbuses");
  }

}