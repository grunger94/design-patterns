package strategy.juego.personaje;

import strategy.juego.arma.Arco;
import strategy.juego.ropa.Tunica;

public class Elfo extends Personaje {

    public Elfo() {
        nombre = "elfo";
        arma = new Arco();
        ropa = new Tunica();
    }
}
