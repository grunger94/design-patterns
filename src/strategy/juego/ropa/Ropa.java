package strategy.juego.ropa;

import strategy.juego.color.Color;
import strategy.juego.color.Rojo;

public abstract class Ropa {

    String nombre;
    private Color color = new Rojo();

    public void viste() {
        System.out.println("Visto " + nombre + " color " + color.get());
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
