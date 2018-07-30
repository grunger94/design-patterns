package factory.method.pedro.animales;

import factory.method.pedro.Animal;

public class GatoTerrestre extends Animal {
    public GatoTerrestre() {
        tipo = "gato terrestre";
        patas = 4;
        ojos = 2;
    }

    @Override
    public void mostrarAntenas() {
        System.out.println("no tengo antenas");
    }
}
