import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseurl: string = "http://localhost:8080/api/users";

  constructor(
    private http: HttpClient
  ) { }

  list(): void {
    this.http.get(this.baseurl).subscribe(
      responseSuccess => { console.log(responseSuccess);},
      errorFail => { console.error(errorFail);}
    );
  }

}
