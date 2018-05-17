import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { QuizListComponent } from './quiz-list/quiz-list.component';
import { QuizQuestionComponent } from './quiz-question/quiz-question.component';
import { QuizItemComponent } from './quiz-item/quiz-item.component';
import { QuizPlayerComponent } from './quiz-player/quiz-player.component';
import { QuizNavComponent } from './quiz-nav/quiz-nav.component';
import { QuizService } from './quiz.service';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
    QuizListComponent,
    QuizQuestionComponent,
    QuizItemComponent,
    QuizPlayerComponent,
    QuizNavComponent
  ],
  providers: [
    QuizService
  ],
  exports: [
    QuizPlayerComponent
  ]
})
export class QuizModule { }
