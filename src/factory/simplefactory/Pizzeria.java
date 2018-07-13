package factory.simplefactory;

class Pizzeria {

    PizzaSimpleFactory factory;

    Pizzeria(PizzaSimpleFactory factory) {
        this.factory = factory;
    }

    Pizza ordenarPizza(String tipo) {
        Pizza pizza = factory.crearPizza(tipo);

        pizza.preparar();
        pizza.cocinar();
        pizza.cortarYEmpacar();

        System.out.println("\n");

        return pizza;
    }
}
