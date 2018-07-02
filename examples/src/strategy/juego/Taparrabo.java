package strategy.juego;

public class Taparrabo extends Ropa {

    @Override
    public void viste() {
        System.out.println("Visto un taparrabo " + color.get());
    }
}
