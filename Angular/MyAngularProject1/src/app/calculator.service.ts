import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  getAddition(a:number, b:number){
    return a+b;
  }
  getSubraction(a:number, b:number){
    return a-b;
  }
  getFactorial(a:number){
    let fact=1;
    for(let i=1;i<=a;i++){
      fact=fact*i;
    }
    return fact;
  }

  constructor() { }
}
