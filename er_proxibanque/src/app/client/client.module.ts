import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientListComponent } from './client-list/client-list.component';
import { ClientFormComponent } from './client-form/client-form.component';
import { ClientService } from './client.service';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'listeClients', component: ClientListComponent },
  { path: 'editClient/:clientId', component: ClientFormComponent },
  { path: 'newClient', component: ClientFormComponent },
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ],
  declarations: [
    ClientListComponent,
    ClientFormComponent
  ],
  providers: [
    ClientService
  ]
})
export class ClientModule { }
