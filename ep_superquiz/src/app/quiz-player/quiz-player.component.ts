import { Component, OnInit } from '@angular/core';
import { QUIZZES } from '../data/quizzes';
import { Answer } from '../models/answer';
import { AnswersState } from '../quiz-state-manager.service';
import { QuizService } from '../quiz.service';
import { Quiz } from '../models/quiz';
import { Question } from '../models/question';

@Component({
  selector: 'app-quiz-player',
  templateUrl: './quiz-player.component.html',
  styles: []
})
export class QuizPlayerComponent implements OnInit {
  currentQuiz: Quiz;
  currentQuestion: Question;
  currentAnswer: Answer;
  currentAnswers: AnswersState;
  isStarted: boolean = false;

  constructor(private quizService: QuizService) {}

  ngOnInit() {
    // Charge le quiz sur lequel l'utilisateur à cliquer
    // L'ID du quiz à charger viendra de l'URL
    const quizId = 32;
    this.currentQuiz = this.quizService.loadQuiz(quizId);
    this.currentQuestion = this.currentQuiz.questions[0];
    this.currentAnswer = new Answer({questionId: this.currentQuestion.id});
    this.currentAnswers = {};
  }

  startQuiz() {
    this.isStarted = true;
  }

  onAnswered(answer: Answer) {
    console.log('Réponse reçue', answer);
  }

}
