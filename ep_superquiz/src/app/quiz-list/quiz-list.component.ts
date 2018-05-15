import { Component, OnInit } from '@angular/core';
import { QUIZZES } from "../data/quizzes";
import { Quiz } from '../models/quiz';

@Component({
  selector: 'app-quiz-list',
  templateUrl: './quiz-list.component.html',
  styles: [
    ".jaune { background: lightyellow }"
  ]
})
export class QuizListComponent implements OnInit {
  quizList = QUIZZES;

  constructor() { }

  ngOnInit() {
  }

  addQuiz() {
    this.quizList.push(new Quiz({
      title: "Quiz bidon",
      description: "Un super quiz"}))
  }

  deleteLastQuiz() {
    this.quizList.pop();
    // if (this.quizList.length == 0) {
    //   alert("Aucun quiz à afficher")
    };

}