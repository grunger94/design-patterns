package strategy.juego;

public class Tunica extends Ropa {

    @Override
    public void viste() {
        System.out.println("Visto una tunica " + color.get());
    }
}
