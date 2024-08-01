import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Customer } from './model/Customer';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Event_Booking_System_Dance';
  customer:Customer;

  constructor()
  {
    this.customer=new Customer();
  }
  
    insertCustomer(data: any){
      this.customer.customerName=data.customerName;
      this.customer.customerEmail=data.customerEmail;
      this.customer.customerContact=data.customerContact;
      alert(data.customerName+" "+data.customerEmail+" "+data.customerContact);
  
    }
  }
