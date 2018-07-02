package strategy.juego.personaje;

import strategy.juego.arma.Hacha;
import strategy.juego.ropa.Taparrabo;

public class Orco extends Personaje {

    public Orco() {
        nombre = "orco";
        arma = new Hacha();
        ropa = new Taparrabo();
    }
}
