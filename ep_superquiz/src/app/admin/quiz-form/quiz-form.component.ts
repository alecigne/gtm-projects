import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { QuizService } from '../../quiz/quiz.service';
import { Quiz } from '../../models/quiz';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-quiz-form',
  templateUrl: './quiz-form.component.html'
})
export class QuizFormComponent implements OnInit {

  quizForm: FormGroup;
  quizId;

  constructor(
    private fb: FormBuilder,
    private qs: QuizService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    // Construction d'un formulaire à vide
    this.quizForm = this.fb.group({
      // Les validateurs doivent être exploités
      quizTitle: ['', [Validators.required, Validators.maxLength(20)]],
      quizDescription: [],
      quizMultipleChoiceAllowed: []
    })

    // Alternative
    // this.quizForm = this.fb.group({
    //   title: [],
    //   description: [],
    //   canRetryQuestion: []
    // })

    // Récupération de l'ID s'il existe, et population éventuelle du formulaire
    this.route.paramMap.subscribe(params => {
      this.quizId = Number(params.get('quizId'));
          // Edition si pertinent
      if (this.quizId) {
        this.qs.loadQuiz(this.quizId).subscribe(quiz => {
          // cf. patchValue si mapping
          this.quizForm.get('quizTitle').setValue(quiz.title);
          this.quizForm.get('quizDescription').setValue(quiz.description);
          this.quizForm.get('quizMultipleChoiceAllowed').setValue(quiz.canRetryQuestion);
          // Alternative
          // this.quizForm.patchValue(quiz);
        });
      }
    });
  }

  buildQuiz() {
    // Récupération de l'objet formulaire.
    const data = this.quizForm.value;
    // Création d'un quiz
    const quiz: Quiz = new Quiz({
      // Si on avait un mapping de noms, on pourrait utiliser directement l'objet data
      id: this.quizId,
      title: data.quizTitle,
      description: data.quizDescription,
      canRetryQuestion: data.quizMultipleChoiceAllowed
    });
    // Alternative
    // const quiz = new Quiz(data);
    // Ici on attribue l'ID du quiz au nouveau quiz. Dans tous les cas,
    // le quiz avec ou sans ID est pris en charge correctement par saveQuiz();
    // quiz.id = this.quizId;
    this.qs.saveQuiz(quiz).subscribe(() => {
      this.quizId ? alert("Quiz modifié !") : alert("Quiz créé !");
      // Service dont le rôle est d'afficher un composant modal, pas présent ici
      // this.modalService.show('Message');
      this.router.navigate(['/admin/quiz'])
    });
  }

}