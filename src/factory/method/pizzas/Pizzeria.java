package factory.method.pizzas;

public abstract class Pizzeria {

    Pizza ordenarPizza(String tipo) {
        Pizza pizza = crearPizza(tipo);

        pizza.preparar();
        pizza.cocinar();
        pizza.cortarYEmpacar();

        System.out.println("\n");

        return pizza;
    }

    protected abstract Pizza crearPizza(String tipo);
}
