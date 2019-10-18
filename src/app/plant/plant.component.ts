import { Component, OnInit } from '@angular/core';
import { HttpClientService, Plant } from '../service/http-client.service';
@Component({
  selector: 'app-plant',
  templateUrl: './plant.component.html',
  styleUrls: ['./plant.component.css']
})
  

export class PlantComponent implements OnInit {

  plant: Plant[];

  constructor(
    private httpClientService: HttpClientService
  ) { }

  ngOnInit() {
    this.httpClientService.getPlants().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  handleSuccessfulResponse(response) {
    this.plant = response;
  }

}
