import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConvertToSpacesComponent } from './convert-to-spaces.component';

describe('ConvertToSpacesComponent', () => {
  let component: ConvertToSpacesComponent;
  let fixture: ComponentFixture<ConvertToSpacesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConvertToSpacesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConvertToSpacesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
