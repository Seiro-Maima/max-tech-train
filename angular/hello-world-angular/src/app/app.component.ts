// how to use code from another file in this file
// Component is name of class, @angular/core is location
import { Component } from '@angular/core';

// call decorater on Component Class
// this is a JSON file
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

// export means this class can be imported 
// somewhere else
export class AppComponent {
  // properties
  title = 'Bootcamp in Angular';
  txt = 'initial value';

  clicked(){
    this.title = "Changed the title message";
  }
}
