package strategy.pedro.persona;

import strategy.pedro.bebida.Bebida;
import strategy.pedro.bebida.NingunaBebida;

public abstract class Persona {
    protected String nombre;
    private Bebida bebida = new NingunaBebida();

    public void muestra() {
        System.out.println("Hola soy un " + nombre);
    }

    public void bebe() {
        System.out.println("Bebo " + bebida.get());
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}
