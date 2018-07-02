package strategy.juego.arma;

public abstract class Arma {

    String nombre;

    public void usa() {
        System.out.println("Usando " + nombre);
    }
}
