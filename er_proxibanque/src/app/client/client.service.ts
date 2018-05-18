import { Injectable } from '@angular/core';
import { Client } from './client';

@Injectable()
export class ClientService {

  constructor() { }

  loadClients(): Client[] {
    return;
  }

  loadClient(id: Number): Client {
    return;
  }
  
  saveClient(client: Client): void {
  }

  deleteClient(id: Number): void {
  }

}
