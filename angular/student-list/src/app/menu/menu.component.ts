import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  // create menu items
  menus: string[] = [
    "Home", "About", "Help"
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
