import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-clients',
  standalone: true,
  imports: [CommonModule,FormsModule],
  template: `
    <div class="container mt-4">
      <h2>Clients</h2>
      <div class="input-group mb-3">
        <input
          type="text"
          class="form-control"
          placeholder="Enter client name"
          [(ngModel)]="newClientName"
          aria-label="Client name"
        />
        <button class="btn btn-primary" (click)="addClient()">Add New Client</button>
      </div>
      <ul class="list-group mt-3">
        <li *ngFor="let client of clients" class="list-group-item d-flex justify-content-between align-items-center">
          {{ client.name }}
          <div>
            <button class="btn btn-warning btn-sm" (click)="editClient(client)">Edit</button>
            <button class="btn btn-danger btn-sm" (click)="deleteClient(client.id)">Delete</button>
          </div>
        </li>
      </ul>
    </div>
  `,
  styles: [`
    .list-group-item {
      background-color: #f8f9fa;
    }
  `]
})
export class ClientsComponent implements OnInit {
  clients: any[] = [];
  newClientName: string = ''; // Added to bind input value

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchClients();
  }

  fetchClients() {
    this.http.get<any[]>('http://localhost:3000/clients').subscribe(data => {
      this.clients = data;
    });
  }

  addClient() {
    if (this.newClientName.trim() !== '') { // Check for valid input
      const newClient = { name: this.newClientName };
      this.http.post('http://localhost:3000/clients', newClient).subscribe(() => {
        this.fetchClients();
        this.newClientName = ''; // Reset input field after adding
      });
    }
  }

  editClient(client: any) {
    const updatedClient = { ...client, name: prompt('Edit client name:', client.name) };
    this.http.put(`http://localhost:3000/clients/${client.id}`, updatedClient).subscribe(() => {
      this.fetchClients();
    });
  }

  deleteClient(id: number) {
    this.http.delete(`http://localhost:3000/clients/${id}`).subscribe(() => {
      this.fetchClients();
    });
  }
}
