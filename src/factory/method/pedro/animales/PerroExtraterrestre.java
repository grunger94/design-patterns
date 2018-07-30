package factory.method.pedro.animales;

import factory.method.pedro.Animal;

public class PerroExtraterrestre extends Animal {
    public PerroExtraterrestre() {
        tipo = "perro extraterrestre";
        patas = 8;
        ojos = 4;
    }

    @Override
    protected void mostrarAntenas() {
        System.out.println("si tengo antenas");
    }
}
