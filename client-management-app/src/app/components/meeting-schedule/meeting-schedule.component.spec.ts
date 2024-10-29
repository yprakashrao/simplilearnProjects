import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeetingScheduleComponent } from './meeting-schedule.component';

describe('MeetingScheduleComponent', () => {
  let component: MeetingScheduleComponent;
  let fixture: ComponentFixture<MeetingScheduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MeetingScheduleComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MeetingScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
