/**
 * Liste des types de pièces de monnaie acceptées par le distributeur.
 */

abstract class Coin {
    protected abstract _value: number;
    protected abstract _url: string;

    get value(): number {
        return this._value;
    }

    get url(): string {
        return this._url;
    }
}

class Quarter extends Coin {
    protected _value = 0.25;
    protected _url = "./img/Quarter.png";
}

class Dime extends Coin {
    protected _value = 0.10;
    protected _url = "./img/Dime.png";
}

class Half extends Coin {
    protected _value = 0.50;
    protected _url = "./img/Half.png";
}

class Dollar extends Coin {
    protected _value = 1;
    protected _url = "./img/Dollar.jpg";
}