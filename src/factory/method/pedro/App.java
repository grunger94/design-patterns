package factory.method.pedro;

import factory.method.pedro.animalfactory.AnimalExtraterrestreFactory;
import factory.method.pedro.animalfactory.AnimalTerrestreFactory;

public class App {
    public static void main(String[] args) {
        try {
            String tipoAnimal = args[0];
            String origen = args[1];

            AnimalFactory animalFactory = crear(origen);
            Animal animal = animalFactory.crear(tipoAnimal);

            animal.mostrarAtributos();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static AnimalFactory crear(String origen) throws IllegalArgumentException {
        AnimalFactory animalFactory = null;

        if (origen.equals("terrestre")) {
            animalFactory = new AnimalTerrestreFactory();
        } else if (origen.equals("extraterrestre")) {
            animalFactory = new AnimalExtraterrestreFactory();
        } else {
            throw new IllegalArgumentException("origen de animal no válido");
        }

        return animalFactory;
    }
}
