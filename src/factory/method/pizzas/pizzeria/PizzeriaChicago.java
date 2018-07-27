package factory.method.pizzas.pizzeria;

import factory.method.pizzas.Pizza;
import factory.method.pizzas.pizza.PizzaDeQuesoEstiloChicago;
import factory.method.pizzas.Pizzeria;

public class PizzeriaChicago extends Pizzeria {

    @Override
    protected Pizza crearPizza(String tipo) {
        Pizza pizza = null;

        if (tipo.equals("queso")) {
            pizza = new PizzaDeQuesoEstiloChicago();
        }

        return pizza;
    }
}
