import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlantComponent } from './plant/plant.component';
import { FoodsComponent } from './foods/foods.component';
import { HomeComponent } from './home/home.component';
import { CartComponent } from './cart/cart.component';
import { AuthComponent } from './auth/auth.component';
const routes: Routes = [
  { path: 'plant', component: PlantComponent },
  { path: 'foods', component: FoodsComponent },
  { path: 'home', component: HomeComponent },
  { path: 'cart', component: CartComponent },
  { path: 'auth', component: AuthComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
