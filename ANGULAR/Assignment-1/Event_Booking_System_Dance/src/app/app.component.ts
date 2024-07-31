import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Event_Booking_System_Dance';

  select: boolean;
  Events: string[];
  myStyle:{};
  myClass: string;
  SelectedEvent: string = "";
  

  constructor() {
    this.select = true;
    this.Events = ["Marriage", "BirthdayParty", "Family reunion", "Friends reunion", "Office Fun"];
    this.myStyle={'width' : '40%','border' : '2px solid yellow'};
    this.myClass = "";
  }

changeSelect(){
  this.select=!this.select;
}

setSelectedItem(event:string){
this.SelectedEvent=event;
}


}
