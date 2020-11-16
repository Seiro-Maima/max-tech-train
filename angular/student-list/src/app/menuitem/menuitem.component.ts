import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-menuitem',
  templateUrl: './menuitem.component.html',
  styleUrls: ['./menuitem.component.css']
})
export class MenuitemComponent implements OnInit {

  // this component will allow parent to push data into menu
  @Input() menu: string;

  constructor() { }

  ngOnInit(): void {
  }

}
