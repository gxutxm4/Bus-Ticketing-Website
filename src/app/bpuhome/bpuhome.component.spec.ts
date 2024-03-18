import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BPUHomeComponent } from './bpuhome.component';

describe('BPUHomeComponent', () => {
  let component: BPUHomeComponent;
  let fixture: ComponentFixture<BPUHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BPUHomeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BPUHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
