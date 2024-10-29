import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgIf, NgFor } from '@angular/common';

@Component({
  selector: 'app-add-client',
  standalone: true,
  imports: [FormsModule,NgIf, NgFor],
  template: `
    <h2>Add New Client</h2>
    <form (submit)="addClient()">
      <input [(ngModel)]="newClient.name" placeholder="Name" required />
      <input [(ngModel)]="newClient.email" placeholder="Email" required type="email" />
      <input [(ngModel)]="newClient.phone" placeholder="Phone" required />
      <button type="submit">Add Client</button>
    </form>
  `,
  styles: [`
    form {
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    input {
      margin: 5px 0;
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 5px;
      width: 200px;
    }

    button {
      margin-top: 10px;
      padding: 10px 15px;
      border: none;
      background-color: #007bff;
      color: white;
      border-radius: 5px;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    button:hover {
      background-color: #0056b3;
    }
  `]
})
export class AddClientComponent {
  newClient = { name: '', email: '', phone: '' };

  addClient() {
    console.log('Client added:', this.newClient);
    this.newClient = { name: '', email: '', phone: '' }; // Reset form
  }
}
