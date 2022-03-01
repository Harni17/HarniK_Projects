import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule} from '@angular/forms'
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
     
const routes: Routes = [{
    
  path:'',
  component:AppComponent
},
     
{
  path:'signup',
  component:SignupComponent
},
{
  path:'sigin',
  component:SigninComponent
}
     
]
     
@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    SigninComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
     
     
