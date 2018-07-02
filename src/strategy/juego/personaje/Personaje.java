package strategy.juego.personaje;

import strategy.juego.arma.Arma;
import strategy.juego.ropa.Ropa;

public abstract class Personaje {

    String nombre;
    Arma arma;
    Ropa ropa;

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }

    public void muestra() {
        System.out.println("Hola soy un " + nombre);
    }

    public void ataca() {
        arma.usa();
    }

    public void viste() {
        ropa.viste();
    }
}
