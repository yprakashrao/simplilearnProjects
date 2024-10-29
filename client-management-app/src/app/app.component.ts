import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterModule],
  template: `
    <nav class="navbar">
      <a class="navbar-brand" href="#">Client Management</a>
      <div class="navbar-links">
        <a routerLink="/clients">Clients</a>
        <a routerLink="/projects">Projects</a>
        <a routerLink="/meetings">Meetings</a>
      </div>
    </nav>
    <div class="container">
      <router-outlet></router-outlet>
    </div>
  `,
  styles: [`
    .navbar {
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 15px;
      background: linear-gradient(90deg, #4e54c8, #8f94fb);
      color: white;
      font-size: 18px;
      border-radius: 8px;
      margin-bottom: 20px;
    }
    .navbar-brand {
      font-weight: bold;
      font-size: 22px;
    }
    .navbar-links a {
      color: white;
      margin: 0 10px;
      text-decoration: none;
      transition: color 0.3s;
    }
    .navbar-links a:hover {
      color: #ffd700;
    }
  `]
})
export class AppComponent {}
