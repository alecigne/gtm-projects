import { Component, OnInit } from '@angular/core';
import { QUIZZES } from "../data/quizzes";
import { Quiz } from '../models/quiz';
import { QuizService } from '../quiz.service';

@Component({
  selector: 'app-quiz-list',
  templateUrl: './quiz-list.component.html',
  styles: [
    ".jaune { background: lightyellow }"
  ]
})
export class QuizListComponent implements OnInit {
  // Eviter d'avoir undefined (temps de chargement du backend)
  quizList: Quiz[] = [];

  constructor(private quizService:QuizService) {}

  ngOnInit() {
    this.quizList = this.quizService.loadQuizzes();
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