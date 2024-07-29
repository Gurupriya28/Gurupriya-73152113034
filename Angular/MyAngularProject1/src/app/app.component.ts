import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name :string;
  age : number;
  email: string;
  imagePath: string;

constructor(){
  this.name="Priya";
  this.age=20;
  this.email="priya@gmail.com";
  this.imagePath="https://miro.medium.com/v2/resize:fit:720/format:webp/1*lqMtWmTLHxT_6SN4Kjvaog.png"
}
chaneName(){
  this.name="Mouni";
}
changeAge(){
  this.age=21;
}
changeEmail(){
  this.email="mouni@gmail.com";
}
changeImage(){
  this.imagePath="https://miro.medium.com/v2/resize:fit:720/format:webp/1*bMgQ8MhbnQexpqHgIgBJPA.png"
}

}
