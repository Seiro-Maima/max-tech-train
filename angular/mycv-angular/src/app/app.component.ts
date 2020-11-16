import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'mycv-angular';
  name: string = 'Marshmellow Holland';
  address: string = '1234 Dreamland Dr.';
  cityStateZip: string = 'Sleepville, OR. 99999';
  phone: string = '(503)123-4567';
  email: string = 'marshmellow@mymail.com';
  displayEducation: boolean = true;
}
