/**
 * Liste des types de pièces de monnaie acceptées par le distributeur.
 */

export abstract class Coin {
    protected abstract _value: number;
    protected abstract _url: string;

    get value(): number {
        return this._value;
    }

    get url(): string {
        return this._url;
    }

}

// Avec héritage

export class Quarter extends Coin {
    protected _value = 0.25;
    protected _url = "./img/Quarter.png";
}

export class Dime extends Coin {
    protected _value = 0.10;
    protected _url = "./img/Dime.png";
}

export class Half extends Coin {
    protected _value = 0.50;
    protected _url = "./img/Half.png";
}

export class Dollar extends Coin {
    protected _value = 1;
    protected _url = "./img/Dollar.jpg";
}

// Sans Héritage

/* class Quarter extends Coin {
    value: number = 0.25;

    getImageUrl(): string {
        return "./img/Quarter.png"
    }

}

class Dime {
    // Autre possibilité, plus élégant
    private _value: number = 0.10;

    // Ceci n'est pas une méthode ! (???)
    get value(): number {
        return this._value;
    }

    getImageUrl(): string {
        return "./img/Dime.png"
    }
}

class Half {
    // Autre possibilité (attention avec un objet, c'est la référence qui est)
    readonly value: number = 0.50;

    getImageUrl(): string {
        return "./img/Half.png"
    }

}

class Dollar {
    // Autre possibilité
    // value: number = 1;

    get value() {
        return 1;
    }

    getImageUrl(): string {
        return "./img/Dollar.jpg"
    }

} */