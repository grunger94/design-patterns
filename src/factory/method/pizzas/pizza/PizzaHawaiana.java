package factory.method.pizzas.pizza;

import factory.method.pizzas.Pizza;

public class PizzaHawaiana extends Pizza {

    public PizzaHawaiana() {
        nombre = "hawaiana";
        masa = "normal";
        salsa = "tomate";
        ingredientes.add("jamon");
        ingredientes.add("pinha");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 minutos a 250 grados");
    }
}
