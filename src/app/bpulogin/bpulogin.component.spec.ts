import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BPULoginComponent } from './bpulogin.component';

describe('BPULoginComponent', () => {
  let component: BPULoginComponent;
  let fixture: ComponentFixture<BPULoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BPULoginComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BPULoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
