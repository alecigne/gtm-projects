/**
 * Liste des catégories de produits.
 */

abstract class ProductCategory {
  abstract name: string;
  abstract getImageUrl(): string;
}

class SodaCategory extends ProductCategory {
  name = 'Soda';
  getImageUrl() {
    return 'img/SodaCan.png';
  }
}

class NutsCategory extends ProductCategory {
  name = 'Nuts';
  getImageUrl() {
    return 'img/Nuts.png';
  }
}

class ChipsCategory extends ProductCategory {
  name = 'Potato chips';
  getImageUrl() {
    return 'img/Chips.png';
  }
}

class CandyCategory extends ProductCategory {
  name = 'Candy';
  getImageUrl() {
    return 'img/Candy.png';
  }
}

class CandyBarCategory extends ProductCategory {
  name = 'Candy bar';
  getImageUrl() {
    return 'img/CandyBar.png';
  }
}