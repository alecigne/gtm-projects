import { Component, Input, Output, EventEmitter, OnChanges, OnInit } from '@angular/core';

import { Question } from '../../models/question';
import { Answer } from '../../models/answer';
import { Choice } from '../../models/choice';

@Component({
  selector: 'app-quiz-question',
  templateUrl: './quiz-question.component.html',
  styles: []
})
export class QuizQuestionComponent implements OnInit {
  // Question en cours
  @Input() question: Question;
  @Input() answer: Answer;
  // Output qui transmettra la réponse au parent
  @Output() submit = new EventEmitter<Answer>();

  isSubmitted: boolean; // undefined
  
  constructor() {
  }
  
  ngOnInit(): void {
  }

  // Méthode appelée à chaque changement des inputs
  ngOnChanges() {
    this.isSubmitted = this.answer.isAnswered();
  }

  // Charge une nouvelle question et une nouvelle réponse.
  gotoNextQuestionTEMP() {
    this.question = new Question({
      'id': 35,
      'title': 'Angular est vraiment trop canon.',
      'choices': [
        { 'text': 'Vrai', 'isCorrect': true },
        { 'text': 'Faux' }
      ],
      'explanation': 'À ce stade, comment ne pas en être persuadé ? 😝'
    });
    this.answer = new Answer({
      questionId: 35,
      multipleChoicesAllowed: false
    });
    // Recalcule le flag isSubmitted
    this.isSubmitted = this.answer.isAnswered();
  }

  clickChoice(choice: Choice) {
    if (this.isSubmitted) { return; }

    if (this.answer.hasChoice(choice)) {
      this.answer.removeChoice(choice);
    } else {
      this.answer.addChoice(choice);
    }
  }

  toggleSubmit() {
    this.isSubmitted = true;
    this.submit.emit(this.answer);
  }

  get submitLabel() {
    return !this.isSubmitted ? 'Soumettre' : this.answer.isCorrect ? 'Correct' : 'Incorrect';
  }

  get submitClass() {
    return !this.isSubmitted ? 'btn-primary' : this.answer.isCorrect ? 'btn-success' : 'btn-danger';
  }

}
