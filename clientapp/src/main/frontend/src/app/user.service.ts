import { Injectable } from '@angular/core';
import { Headers, Http, Response } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { User } from './user';

@Injectable()
export class UserService {
  private heroesUrl = 'app/heroes';  // URL to web api
  constructor(private http: Http) { }

  getHeroes(): Promise<User[]> {
    return this.http.get(this.heroesUrl)
     .toPromise()
     .then(response => response.json()._embedded.heroes as User[])
     .catch(this.handleError);
   }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }
}