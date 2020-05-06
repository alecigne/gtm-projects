import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Client } from './client';

@Injectable()
export class ClientService {

  constructor(private http: HttpClient) { }

  loadClients(): Observable<Client[]> {
    return this.http.get<Client[]>('http://localhost:3004/clients');
  }

  loadClient(clientId: number): Observable<Client> {
    return this.http.get<Client>('http://localhost:3004/clients/' + clientId);
  }

  saveClient(client: Client): Observable<Client> {
    if (client.id) { // UPDATE
      return this.http.put<Client>('http://localhost:3004/clients/' + client.id, client);
    } else { // INSERT
      return this.http.post<Client>('http://localhost:3004/clients', client);
    }
  }

  deleteClient(clientId: number): Observable<any> {
    return this.http.delete('http://localhost:3004/clients/' + clientId);
  }

}