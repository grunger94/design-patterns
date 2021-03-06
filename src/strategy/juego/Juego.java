package strategy.juego;

import strategy.juego.arma.Hacha;
import strategy.juego.color.Blanco;
import strategy.juego.personaje.Elfo;
import strategy.juego.personaje.Enano;
import strategy.juego.personaje.Orco;
import strategy.juego.personaje.Personaje;
import strategy.juego.ropa.Ropa;
import strategy.juego.ropa.Tunica;

public class Juego {

    public static void main(String[] args) {
        Personaje personaje = new Elfo();
        Ropa ropa = new Tunica();
        ropa.setColor(new Blanco());
        personaje.setRopa(ropa);
        crea(personaje);

        personaje.setArma(new Hacha());
        crea(personaje);

        personaje = new Orco();
        personaje.setRopa(new Tunica());

        crea(personaje);

        personaje = new Enano();
        crea(personaje);
    }

    private static void crea(Personaje personaje) {
        personaje.muestra();
        personaje.ataca();
        personaje.viste();
        System.out.println("\n");
    }
}
