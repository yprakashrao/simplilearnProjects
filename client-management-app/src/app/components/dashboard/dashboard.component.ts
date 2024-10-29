// src/app/dashboard/dashboard.component.ts
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule],
  template: `
    <div class="dashboard-container">
      <h2>Dashboard</h2>
      <p>Welcome to the client management dashboard.</p>
    </div>
  `,
  styles: [`
    .dashboard-container {
      background-color: #f0f4f8;
      padding: 20px;
      border-radius: 8px;
    }
  `]
})
export class DashboardComponent {}
