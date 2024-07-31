import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  sum : number;
  sub:number;
  mul:number;
  div:number;
  
  constructor(private calc: CalculatorService){
    this .sum = calc.getAddition(10,20);
    this.sub =calc.getSubtraction(40,20);
  this.mul=calc.getMultiplication(10,20);
  this.div=calc.getDivision(20,2);
  
  }  
}
