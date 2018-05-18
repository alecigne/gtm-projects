import { Component, OnInit, Input } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-field',
  templateUrl: './field.component.html',
  styles: []
})
export class FieldComponent implements OnInit {
  @Input() label: string; // quizForm.quizTitle
  @Input() control: FormControl; // quizForm.get('quizTitle')
  @Input() baliseHTML: string; // <input formControlName="quizTitle" type="text" class="form-control" placeholder="Titre">

  constructor() { }

  ngOnInit() {
  }

}
