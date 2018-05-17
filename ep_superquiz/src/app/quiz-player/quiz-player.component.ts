import { Component, OnInit } from '@angular/core';
import { QUIZZES } from '../data/quizzes';
import { Answer } from '../models/answer';
import { AnswersState, QuizStateManager } from '../quiz-state-manager.service';
import { QuizService } from '../quiz.service';
import { Quiz } from '../models/quiz';
import { Question } from '../models/question';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-quiz-player',
  templateUrl: './quiz-player.component.html',
  styles: [],
  // On utilise le QSM localement
  providers: [ QuizStateManager ]
})
export class QuizPlayerComponent implements OnInit {
  // Les propriétés deviennent des observables
  currentQuiz: Observable<Quiz>;
  currentQuestion: Observable<Question>;
  currentAnswer: Observable<Answer>;
  currentAnswers: Observable<AnswersState>;
  isStarted: boolean = false;

  constructor(
    private quizService: QuizService,
    private quizStateManager: QuizStateManager) {}

  ngOnInit() {
    // Ces objets sont désormais fournis par le service
    this.currentQuiz = this.quizStateManager.getCurrentQuiz();
    this.currentQuestion = this.quizStateManager.getCurrentQuestion();
    this.currentAnswer = this.quizStateManager.getCurrentAnswer();
    this.currentAnswers = this.quizStateManager.getCurrentAnswers();
    // Charge le quiz sur lequel l'utilisateur à cliquer
    // L'ID du quiz à charger viendra de l'URL
    const quizId = 32;
    const quiz = this.quizService.loadQuiz(quizId);
    // Pousse le quiz chargé dans l'observable 'currentQuiz'
    this.quizStateManager.setQuiz(quiz);
  }

  onAnswered(answer: Answer) {
    // console.log('Réponse reçue', answer);
    // @TODO: Sauvegarde la réponse dans le service QuizStateManager
    this.quizStateManager.addAnswer(answer);
  }

  gotoNextQuestion() {
    // @TODO: utilise le QuizStateManager pour aller à la question suivante
    this.quizStateManager.gotoNextQuestion();
  }

  gotoPreviousQuestion() {
    // @TODO: utilise le QuizStateManager pour aller à la question précédente
    this.quizStateManager.gotoPreviousQuestion();
  }

  startQuiz() {
    this.isStarted = true;
    // @TODO: utilise le QuizStateManager pour aller à la première question
    this.quizStateManager.gotoFirstQuestion();
  }

}
