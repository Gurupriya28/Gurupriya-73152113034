import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
     sum:number;
     sub:number;
     fact:number;

     constructor(private calc:CalculatorService){
      this.sum=calc.getAddition(10,20);
      this.sub=calc.getSubraction(10,20);
      this.fact=calc.getFactorial(6);

     }
}
