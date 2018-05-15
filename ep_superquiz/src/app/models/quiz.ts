/**
 * @file
 * A quiz and its metadata.
 */
import { Question } from './question';

// Instanciation de Quiz avec un objet en paramètre
/* const q = new Quiz({
  id: 13,
  title: "foo",
  description: "bar"
}) */

interface QuizOptions {
  id?: number;
  title?: string;
  description?: string;
  canRetryQuestion?: boolean;
  questions?: any[];  // Pass raw data. Will be re-hydrated.
}

export class Quiz {
  id: number;
  title: string;
  description: string;
  canRetryQuestion: boolean;
  questions: Question[];

  // Un objet permet de mettre des paramètres optionnels facilement
  // != paramètres positionnels
  constructor(options: QuizOptions = {}) {
    this.id = options.id || null;
    this.title = options.title || '';
    this.description = options.description || '';
    this.canRetryQuestion = options.canRetryQuestion === undefined ? false : options.canRetryQuestion;
    // Re-hydrate the questions.
    this.questions = options.questions ? options.questions.map((q: any) => new Question(q)) : [];
  }

  /**
   * Return a JSON representation of the quiz
   * which is compatible with our backend.
   */
  toJson() {
    return {
      id: this.id,
      title: this.title,
      description: this.description,
      canRetryQuestion: this.canRetryQuestion,
      questions: this.questions.map(q => q.toJson())
    };
  }

}
