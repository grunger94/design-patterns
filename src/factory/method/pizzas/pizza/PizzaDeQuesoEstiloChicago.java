package factory.method.pizzas.pizza;

import factory.method.pizzas.Pizza;

public class PizzaDeQuesoEstiloChicago extends Pizza {

    public PizzaDeQuesoEstiloChicago() {
        nombre = "queso estilo chicago";
        masa = "deep dish";
        salsa = "tomate enlatado";
        ingredientes.add("queso mozzarella");
    }

    @Override
    public void cortarYEmpacar() {
        System.out.println("Cortando en rebanadas cuadradas");
        System.out.println("Empacando");
    }
}
