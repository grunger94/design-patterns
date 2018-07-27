package factory.method.pizzas.pizzeria;

import factory.method.pizzas.Pizza;
import factory.method.pizzas.Pizzeria;
import factory.method.pizzas.pizza.PizzaHawaiana;

public class PizzeriaComun extends Pizzeria {

    @Override
    protected Pizza crearPizza(String tipo) {
        Pizza pizza = null;

        if (tipo.equals("hawaiana")) {
            pizza = new PizzaHawaiana();
        }

        return pizza;
    }
}
