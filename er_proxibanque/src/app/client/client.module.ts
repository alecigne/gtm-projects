import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientListComponent } from './client-list/client-list.component';
import { ClientFormComponent } from './client-form/client-form.component';
import { ClientService } from './client.service';

@NgModule({
  imports: [
    CommonModule
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
