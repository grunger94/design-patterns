package factory.method.pedro.animales;

import factory.method.pedro.Animal;

public class PerroTerrestre extends Animal {
    public PerroTerrestre() {
        tipo = "perro terrestre";
        patas = 4;
        ojos = 2;
    }

    @Override
    public void mostrarAntenas() {
        System.out.println("no tengo antenas");
    }
}
