/**
 * Liste des catégories de produits.
 */

export abstract class ProductCategory {
  abstract name: string;
  abstract getImageUrl(): string;
}

export class SodaCategory extends ProductCategory {
  name = 'Soda';
  getImageUrl() {
    return 'img/SodaCan.png';
  }
}

export class NutsCategory extends ProductCategory {
  name = 'Nuts';
  getImageUrl() {
    return 'img/Nuts.png';
  }
}

export class ChipsCategory extends ProductCategory {
  name = 'Potato chips';
  getImageUrl() {
    return 'img/Chips.png';
  }
}

export class CandyCategory extends ProductCategory {
  name = 'Candy';
  getImageUrl() {
    return 'img/Candy.png';
  }
}

export class CandyBarCategory extends ProductCategory {
  name = 'Candy bar';
  getImageUrl() {
    return 'img/CandyBar.png';
  }
}