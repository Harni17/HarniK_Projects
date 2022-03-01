import{ NgModule } from'@angular/core';
import{ RouterModule, Routes } from'@angular/router';
import{ AboutComponent } from'./about/about.component';
import{ ContactComponent } from'./contact/contact.component';
import{ FooditemsComponent } from'./fooditems/fooditems.component';
import{ HomeComponent } from'./home/home.component';
import{ PaymentComponent } from'./payment/payment.component';

constroutes: Routes = [
  {path:'',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'fooditems',component:FooditemsComponent},
  {path:'contact',component:ContactComponent},
  {path:'payment',component:PaymentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
exportclassAppRoutingModule{ }
