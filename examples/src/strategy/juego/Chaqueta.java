package strategy.juego;

public class Chaqueta extends Ropa {

    @Override
    public void viste() {
        System.out.println("Visto una chaqueta " + color.get());
    }
}
