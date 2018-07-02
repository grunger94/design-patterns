package strategy.juego.personaje;

import strategy.juego.arma.Hacha;
import strategy.juego.ropa.Chaqueta;

public class Enano extends Personaje {

    public Enano() {
        nombre = "enano";
        arma = new Hacha();
        ropa = new Chaqueta();
    }
}
