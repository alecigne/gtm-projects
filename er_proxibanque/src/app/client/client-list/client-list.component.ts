import { Component, OnInit } from '@angular/core';
import { Client } from '../client';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html'
})
export class ClientListComponent implements OnInit {

  clientsList: Client[] = [];

  constructor(private cs: ClientService) {}

  ngOnInit() {
    this.cs.loadClients().subscribe(data => this.clientsList = data);
  }

  deleteClient(id: number) {
    this.cs.deleteClient(id).subscribe();
    alert('Client n°' + id + ' effacé.');
  }

}
