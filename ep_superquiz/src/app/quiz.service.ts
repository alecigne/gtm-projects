import { Injectable } from '@angular/core';
import { Quiz } from './models/quiz';
import { QUIZZES } from './data/quizzes';

@Injectable()
export class QuizService {

  constructor() { }

  loadQuizzes(): Quiz[] {
    return QUIZZES;
  };

  loadQuiz(quizId: number): Quiz {
    return QUIZZES.find(quiz => quiz.id === quizId);
  };

}
