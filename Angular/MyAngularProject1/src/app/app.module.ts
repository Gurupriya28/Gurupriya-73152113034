import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { Routes, RouterModule } from '@angular/router';
import { CalculatorService } from './calculator.service';
import { ChildComponent } from './child/child.component';

const ROUTES: Routes = [
  { path : 'Home', component : HomeComponent},
  { path : 'Contact', component : ContactComponent},
  { path : 'About', component : AboutComponent}
  ];
  
@NgModule({
  declarations: [
    AppComponent,
    HeroDetailComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES),
  ],
  providers: [
    CalculatorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
