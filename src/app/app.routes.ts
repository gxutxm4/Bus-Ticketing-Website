import { Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { AboutComponent } from './about/about.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { BPURegistrationComponent } from './bpuregistration/bpuregistration.component';
import { BPULoginComponent } from './bpulogin/bpulogin.component';
import { BPUHomeComponent } from './bpuhome/bpuhome.component';
import { ShowBusesComponent } from './show-buses/show-buses.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { AddBusComponent } from './add-bus/add-bus.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { UserPaymentComponent } from './user-payment/user-payment.component';

export const routes: Routes = [
    {path:"", component:HomePageComponent},
    {path:"home", component:HomePageComponent},
    {path:"about", component:AboutComponent},
    {path:"userreg", component:UserRegistrationComponent},
    {path:"userlogin", component:UserLoginComponent},
    {path:"bpureg", component:BPURegistrationComponent},
    {path:"bpulogin", component:BPULoginComponent},
    {path:"bpuhome", component:BPUHomeComponent},
    {path:"showbuses", component:ShowBusesComponent},
    {path:"addbus", component:AddBusComponent},
    {path:"bookticket", component:BookTicketComponent},
    {path:"userpayment", component:UserPaymentComponent},
    {path:"**", component:NotFoundComponent}
];
