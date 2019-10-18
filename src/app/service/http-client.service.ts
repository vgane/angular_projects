import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AuthComponent } from '../auth/auth.component';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'applications/json' })
};

export class Plant {
  constructor(
    public plantId: number,
    public plantName: string,
    public plantDescription:string,
    public inStock: number

  
  ) { }
}
export class Foods {
  constructor(
    public foodId: number,
    public  dishName:string,
    public  foodDescription:string,
    public amountofServings: number,
    public pricePerServing: number
  ) { }
}

export class Cart {
  constructor(
    public amount: string
  ) { }
}


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {


  constructor(
    private httpClient: HttpClient
  ) {
  }

  getPlants() {
    console.log("test call");
    return this.httpClient.get<Plant[]>('http://localhost:8080/plants');

  }

  getFoods() {
    console.log("test call2");
    return this.httpClient.get<Foods[]>('http://localhost:8080/foods');

  }

  getCart() {
    console.log("test call3");
    return this.httpClient.get<Cart[]>('http://localhost:8080/cart');
  }
  getLogin() {
    console.log("test call3");
    return this.httpClient.get('http://localhost:8080/login');
  }
  getLogout() {
    console.log("test call3");
    return this.httpClient.get('http://localhost:8080/logout');
  }

}
