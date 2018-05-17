import { Injectable } from '@angular/core';
import { Quiz } from '../models/quiz';
import { QUIZZES } from '../data/quizzes';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class QuizService {

  constructor(private http:HttpClient) { }

  loadQuizzes(): Observable<Quiz[]> {
    return this.http.get<Quiz[]>('http://localhost:3004/quizzes');
  };

  loadQuiz(quizId: number): Observable<Quiz> {
    return this.http.get<Quiz>(`http://localhost:3004/quizzes/${quizId}`);
  };

}
