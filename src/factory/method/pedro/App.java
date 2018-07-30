package factory.method.pedro;

import factory.method.pedro.animalfactory.AnimalExtraterrestreFactory;
import factory.method.pedro.animalfactory.AnimalTerrestreFactory;

public class App {
    public static void main(String[] args) {
        String tipoAnimal = args[0];
        String origen = args[1];

        AnimalFactory animalFactory = null;

        if (origen.equals("terrestre")) {
            animalFactory = new AnimalTerrestreFactory();
        } else if (origen.equals("extraterrestre")) {
            animalFactory = new AnimalExtraterrestreFactory();
        }

        if (animalFactory == null) {
            System.out.println("origen no válido");
            return;
        }

        Animal animal = animalFactory.crear(tipoAnimal);

        if (animal == null) {
            System.out.println("tipo de animal no válido");
            return;
        }

        animal.mostrarTipo();
        animal.mostrarOjos();
        animal.mostrarPatas();
        animal.mostrarAntenas();
        System.out.println("\n");
    }
}