package factory.method.pizzas;

import factory.method.pizzas.pizzeria.PizzeriaChicago;
import factory.method.pizzas.pizzeria.PizzeriaComun;
import factory.method.pizzas.pizzeria.PizzeriaNY;

public class PizzaTest {

    public static void main(String[] args) {
        Pizzeria pizzeria;
        String tipo = args[0];
        String ciudad = args[1];

        if (tipo.equals("hawaiana")) {
            pizzeria = new PizzeriaComun();
        } else {
            if (ciudad.equals("ny")) {
                pizzeria = new PizzeriaNY();
            } else {
                pizzeria = new PizzeriaChicago();
            }
        }

        pizzeria.ordenarPizza(tipo);
    }
}
