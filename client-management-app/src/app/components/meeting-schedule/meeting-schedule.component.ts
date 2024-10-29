import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // Import FormsModule for ngModel

@Component({
  selector: 'app-meetings',
  standalone: true,
  imports: [CommonModule, FormsModule], // Include FormsModule here
  template: `
    <div class="container mt-4">
      <h2>Meetings</h2>
      <div class="input-group mb-3">
        <input
          type="text"
          class="form-control"
          placeholder="Enter meeting topic"
          [(ngModel)]="newMeetingTopic" 
          aria-label="Meeting topic"
        />
        <button class="btn btn-primary" (click)="addMeeting()">Add New Meeting</button>
      </div>
      <ul class="list-group mt-3">
        <li *ngFor="let meeting of meetings" class="list-group-item d-flex justify-content-between align-items-center">
          {{ meeting.topic }}
          <div>
            <button class="btn btn-warning btn-sm" (click)="editMeeting(meeting)">Edit</button>
            <button class="btn btn-danger btn-sm" (click)="deleteMeeting(meeting.id)">Delete</button>
          </div>
        </li>
      </ul>
    </div>
  `,
  styles: [`
    .list-group-item {
      background-color: #fce4ec;
    }
  `]
})
export class MeetingsComponent implements OnInit {
  meetings: any[] = [];
  newMeetingTopic: string = ''; // Added to bind input value

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchMeetings();
  }

  fetchMeetings() {
    this.http.get<any[]>('http://localhost:3000/meetings').subscribe(data => {
      this.meetings = data;
    });
  }

  addMeeting() {
    if (this.newMeetingTopic.trim() !== '') { // Check for valid input
      const newMeeting = { topic: this.newMeetingTopic };
      this.http.post('http://localhost:3000/meetings', newMeeting).subscribe(() => {
        this.fetchMeetings();
        this.newMeetingTopic = ''; // Reset input field after adding
      });
    }
  }

  editMeeting(meeting: any) {
    const updatedMeetingTopic = prompt('Edit meeting topic:', meeting.topic);
    if (updatedMeetingTopic) {
      const updatedMeeting = { ...meeting, topic: updatedMeetingTopic };
      this.http.put(`http://localhost:3000/meetings/${meeting.id}`, updatedMeeting).subscribe(() => {
        this.fetchMeetings();
      });
    }
  }

  deleteMeeting(id: number) {
    this.http.delete(`http://localhost:3000/meetings/${id}`).subscribe(() => {
      this.fetchMeetings();
    });
  }
}
