package factory.method.pedro.animales;

import factory.method.pedro.Animal;

public class GatoExtraterrestre extends Animal {
    public GatoExtraterrestre() {
        tipo = "gato extraterrestre";
        patas = 6;
        ojos = 3;
    }

    @Override
    protected void mostrarAntenas() {
        System.out.println("si tengo antenas");
    }
}
