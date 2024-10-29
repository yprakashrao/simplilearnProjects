import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // Import FormsModule for ngModel

@Component({
  selector: 'app-projects',
  standalone: true,
  imports: [CommonModule, FormsModule], // Include FormsModule here
  template: `
    <div class="container mt-4">
      <h2>Projects</h2>
      <div class="input-group mb-3">
        <input
          type="text"
          class="form-control"
          placeholder="Enter project name"
          [(ngModel)]="newProjectName" 
          aria-label="Project name"
        />
        <button class="btn btn-primary" (click)="addProject()">Add New Project</button>
      </div>
      <ul class="list-group mt-3">
        <li *ngFor="let project of projects" class="list-group-item d-flex justify-content-between align-items-center">
          {{ project.name }}
          <div>
            <button class="btn btn-warning btn-sm" (click)="editProject(project)">Edit</button>
            <button class="btn btn-danger btn-sm" (click)="deleteProject(project.id)">Delete</button>
          </div>
        </li>
      </ul>
    </div>
  `,
  styles: [`
    .list-group-item {
      background-color: #e3f2fd;
    }
  `]
})
export class ProjectsComponent implements OnInit {
  projects: any[] = [];
  newProjectName: string = ''; // Added to bind input value

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchProjects();
  }

  fetchProjects() {
    this.http.get<any[]>('http://localhost:3000/projects').subscribe(data => {
      this.projects = data;
    });
  }

  addProject() {
    if (this.newProjectName.trim() !== '') { // Check for valid input
      const newProject = { name: this.newProjectName };
      this.http.post('http://localhost:3000/projects', newProject).subscribe(() => {
        this.fetchProjects();
        this.newProjectName = ''; // Reset input field after adding
      });
    }
  }

  editProject(project: any) {
    const updatedProjectName = prompt('Edit project name:', project.name);
    if (updatedProjectName) {
      const updatedProject = { ...project, name: updatedProjectName };
      this.http.put(`http://localhost:3000/projects/${project.id}`, updatedProject).subscribe(() => {
        this.fetchProjects();
      });
    }
  }

  deleteProject(id: number) {
    this.http.delete(`http://localhost:3000/projects/${id}`).subscribe(() => {
      this.fetchProjects();
    });
  }
}
