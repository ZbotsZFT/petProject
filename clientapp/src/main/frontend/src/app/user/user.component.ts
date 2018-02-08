import {Component, OnInit} from '@angular/core';

import {AppDataService} from '../services/app-data.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.teamplate.html'
})
export class UserComponent implements OnInit {
  city$;

  constructor(private appDataService: AppDataService) {
  }

  ngOnInit() {
    this.city$ = this.appDataService.getCities();
  }
}
