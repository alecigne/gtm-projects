export interface Conseiller {
  id: string;
  nom: string;
}

export interface Client {
  id?: Number;
  prenom: string;
  nom: string;
  login: string;
  password: string;
  // conseiller: Conseiller;
}