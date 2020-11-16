import { Component } from '@angular/core';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'student-list';

  // bootstrap style to show blue button
  btnStyle: string = "btn btn-primary";
  
  // simulate asynchronous
  students: any[] = [];

  studentCollection: any[] = [
    {name: "Tanya", favNumber: 12345, favColor: "orange"},
    {name: "Kali", favNumber: 23456, favColor: "blue"},
    {name: "Hung", favNumber: 34567, favColor: "red"},
    {name: "Jack", favNumber: 45678, favColor: "yellow"},
    {name: "Mark", favNumber: 56789, favColor: "green"},
    {name: "Christian", favNumber: 67890, favColor: "blue"},
    {name: "Jonathan", favNumber: 78901, favColor: "silver"},
    {name: "Manami", favNumber: 891011, favColor: "pink"},
    {name: "Tracy", favNumber: 9101112, favColor: "white"},
    {name: "Elena", favNumber: 10111213, favColor: "black"},
    {name: "Marc", favNumber: 11121314, favColor: "beige"}
  ];

  getStudents(): void{
    // copy data from studentCollection to students
    this.students = this.studentCollection;
  }

  changeColor(): void{
    this.btnStyle = "btn btn-danger";
  }

  constructor(
    private usersvc: UserService
  ){
    this.usersvc.list();
  }

  ngOnInit(): void {

  }

}
