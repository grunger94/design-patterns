package factory.method.pedro.animalfactory;

import factory.method.pedro.Animal;
import factory.method.pedro.AnimalFactory;

import factory.method.pedro.animales.GatoExtraterrestre;
import factory.method.pedro.animales.PerroExtraterrestre;

public class AnimalExtraterrestreFactory extends AnimalFactory {
    public Animal crear(String tipo) throws IllegalArgumentException {
        Animal animal = null;

        if (tipo.equals("gato")) {
            animal = new GatoExtraterrestre();
        } else if (tipo.equals("perro")) {
            animal = new PerroExtraterrestre();
        } else {
            throw new IllegalArgumentException("tipo de animal no válido");
        }

        return animal;
    }
}
