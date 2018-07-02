package strategy.juego;

abstract class Personaje {

    String nombre;
    Arma arma;
    Ropa ropa;

    void setArma(Arma arma) {
        this.arma = arma;
    }

    void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }

    void muestra() {
        System.out.println("Hola soy un " + nombre);
    }

    void ataca() {
        arma.usa();
    }

    void viste() {
        ropa.viste();
    }
}
