package strategy.juego;

public abstract class Ropa {

    Color color = new Rojo();

    abstract void viste();

    void setColor(Color color) {
        this.color = color;
    }
}
