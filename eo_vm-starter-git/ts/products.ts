import { ProductCategory, SodaCategory, NutsCategory, ChipsCategory, CandyCategory, CandyBarCategory } from "./categories";

/**
 * Liste des produits vendus dans le distributeur.
 */

export interface Product {
  name: string;
  price: number;
  category?: ProductCategory
}

export class Initial implements Product {
  name = 'Please select a product';
  price = 0;
}

class CocaCola implements Product {
  name = 'Coca-Cola';
  price = 2.3;
  category = new SodaCategory();
}

class Fanta implements Product {
  name = 'Fanta';
  price = 2;
  category = new SodaCategory();
}

class Sprite implements Product {
  name = 'Sprite';
  price = 1.80;
  category = new SodaCategory();
}

class Peanuts implements Product {
  name = 'Peanuts';
  price = 1.50;
  category = new NutsCategory();
}

class Cashews implements Product {
  name = 'Cashews';
  price = 2.80;
  category = new NutsCategory();
}

class Plain implements Product {
  name = 'Plain';
  price = 2;
  category = new ChipsCategory();
}

class Cheddar implements Product {
  name = 'Cheddar';
  price = 2;
  category = new ChipsCategory();
}

class Mints implements Product {
  name = 'Mints';
  price = 1.30;
  category = new CandyCategory();
}

class Gummies implements Product {
  name = 'Gummies';
  price = 1.90;
  category = new CandyCategory();
}

class Hersey implements Product {
  name = 'Hersey\'s';
  price = 1.30;
  category = new CandyBarCategory();
}

class MilkyWay implements Product {
  name = 'Milky Way';
  price = 1.80;
  category = new CandyBarCategory();
}

export function getProduct() {
  const random = Math.floor(Math.random() * 11);
  switch (random) {
    case 0: return new CocaCola();
    case 1: return new Fanta();
    case 2: return new Sprite();
    case 3: return new Peanuts();
    case 4: return new Cashews();
    case 5: return new Plain();
    case 6: return new Cheddar();
    case 7: return new Mints();
    case 8: return new Gummies();
    case 9: return new Hersey();
    case 10: return new MilkyWay();
  }
}