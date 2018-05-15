/// <reference path="categories.ts"/>

/**
 * Liste des produits vendus dans le distributeur.
 */

class CocaCola {
  name = 'Coca-Cola';
  price = 2.3;
  category = new SodaCategory();
}

class Fanta {
  name = 'Fanta';
  price = 2;
  category = new SodaCategory();
}

class Sprite {
  name = 'Sprite';
  price = 1.80;
  category = new SodaCategory();
}

class Peanuts {
  name = 'Peanuts';
  price = 1.50;
  category = new NutsCategory();
}

class Cashews {
  name = 'Cashews';
  price = 2.80;
  category = new NutsCategory();
}

class Plain {
  name = 'Plain';
  price = 2;
  category = new ChipsCategory();
}

class Cheddar {
  name = 'Cheddar';
  price = 2;
  category = new ChipsCategory();
}

class Mints {
  name = 'Mints';
  price = 1.30;
  category = new CandyCategory();
}

class Gummies {
  name = 'Gummies';
  price = 1.90;
  category = new CandyCategory();
}

class Hersey {
  name = 'Hersey\'s';
  price = 1.30;
  category = new CandyBarCategory();
}

class MilkyWay {
  name = 'Milky Way';
  price = 1.80;
  category = new CandyBarCategory();
}