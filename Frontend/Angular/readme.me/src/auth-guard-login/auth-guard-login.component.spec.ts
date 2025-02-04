import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthGuardLoginComponent } from './auth-guard-login.component';

describe('AuthGuardLoginComponent', () => {
  let component: AuthGuardLoginComponent;
  let fixture: ComponentFixture<AuthGuardLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AuthGuardLoginComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AuthGuardLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
