
import {Routes } from '@angular/router';
import { ProjectsComponent } from './components/project-list/project-list.component';
import { MeetingsComponent } from './components/meeting-schedule/meeting-schedule.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ClientsComponent } from './components/client-list/client-list.component';

export const routes: Routes =  [
  { path: '', component: DashboardComponent },
  { path: 'clients', component: ClientsComponent },
  { path: 'projects', component: ProjectsComponent },
  { path: 'meetings', component: MeetingsComponent },
];
