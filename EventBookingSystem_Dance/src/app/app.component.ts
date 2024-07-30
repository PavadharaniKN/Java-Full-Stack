import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
title = 'EventBookingSystem_Dance';
name : string;
age : number;
email : string;
txtcolor : string;
imgpath : string;
fname:String;
constructor(){
  this.name="Pavadharani";
  this.age=20;
  this.email="pavadharaninargunaraj474@gamil.com";
  this.txtcolor="green";
  this.imgpath="https://tse3.mm.bing.net/th?id=OIP.jdeecq8qrVkz10fSEszU7AHaFj&pid=Api&P=0&h=180";
  this.string="";
}
getAddition(a : number, b : number){
  let sum=a+b;
  return sum;
}
changeName(){
  this.name="pava";
}
changeEmail(){
  this.email="pava123@gmail.com"
  } 
}