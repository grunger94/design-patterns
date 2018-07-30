package factory.method.pedro.animalfactory;

import factory.method.pedro.Animal;
import factory.method.pedro.AnimalFactory;

import factory.method.pedro.animales.GatoTerrestre;
import factory.method.pedro.animales.PerroTerrestre;

public class AnimalTerrestreFactory extends AnimalFactory {
    public Animal crear(String tipo) {
        Animal animal = null;

        if (tipo.equals("gato")) {
            animal = new GatoTerrestre();
        } else if (tipo.equals("perro")) {
            animal = new PerroTerrestre();
        }

        return animal;
    }
}
