import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BPURegistrationComponent } from './bpuregistration.component';

describe('BPURegistrationComponent', () => {
  let component: BPURegistrationComponent;
  let fixture: ComponentFixture<BPURegistrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BPURegistrationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BPURegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
