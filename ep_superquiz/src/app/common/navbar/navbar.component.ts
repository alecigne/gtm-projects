import { Component, OnInit } from '@angular/core';
import { User } from '../../models/user';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styles: []
})
export class NavbarComponent implements OnInit {
  logoPath = "/assets/logo_superquiz.png";
  user = new User({name: "Bob l'Eponge", email: "bob@eponge.com"});

  constructor() { }

  ngOnInit() {
  }

}
