import { Component } from '@angular/core';
import { NgIf, NgFor } from '@angular/common';

@Component({
  selector: 'app-client-detail',
  standalone: true,
  imports: [NgIf, NgFor],
  template: `
    <h2>Client Detail</h2>
    <p>Select a client to see details.</p>
  `,
  styles: [`
    h2 {
      color: #007bff;
    }
  `]
})
export class ClientDetailComponent {}
