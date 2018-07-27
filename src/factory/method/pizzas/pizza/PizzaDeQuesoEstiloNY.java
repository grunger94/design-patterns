package factory.method.pizzas.pizza;

import factory.method.pizzas.Pizza;

public class PizzaDeQuesoEstiloNY extends Pizza {

    public PizzaDeQuesoEstiloNY() {
        nombre = "queso tipo NY";
        masa = "delgada";
        salsa = "marinara";
        ingredientes.add("queso reggiano");
    }
}
