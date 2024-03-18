import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { AboutComponent } from './about/about.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { BPULoginComponent } from './bpulogin/bpulogin.component';
import { BPURegistrationComponent } from './bpuregistration/bpuregistration.component';
import { BPUHomeComponent } from './bpuhome/bpuhome.component';
import { ShowBusesComponent } from './show-buses/show-buses.component';
import { AddBusComponent } from './add-bus/add-bus.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { UserPaymentComponent } from './user-payment/user-payment.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, RouterModule,
    HomePageComponent, AboutComponent, UserRegistrationComponent, UserLoginComponent, BPULoginComponent, BPURegistrationComponent,
    BPUHomeComponent, ShowBusesComponent, AddBusComponent, BookTicketComponent, UserPaymentComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'BusBookingWebsite';
  fname=localStorage.getItem("userfName");
  fnamelen:boolean=this.fname?.charAt(0)==null;

  bpuName=localStorage.getItem("bpuName");
  bpuNamelen:boolean=this.bpuName?.charAt(0)==null;

  constructor(private router:Router){}

  logout(){    
    window.localStorage.clear();
    // this.router.navigateByUrl("/userlogin");
    window.location.reload();
    this.router.navigateByUrl("/home");
  }
  
}
