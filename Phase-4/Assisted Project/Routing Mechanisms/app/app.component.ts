import { Component,OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Title } from '@angular/platform-browser';
     
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
     
export class AppComponent {
     
  constructor(private formBuilder: FormBuilder) { }
  title = 'angCare';
  status = 'You haven\'t signed up yet';
  name = '';
  
  ontyping(event:Event) {
     
    this.name = (<HTMLInputElement>event.target).value;
  }
  signup() {
  
     this.status = 'Oops! We are working on it!';
     
  }
     
  



}
     
     
