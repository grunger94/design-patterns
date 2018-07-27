package factory.simplefactory;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaSimpleFactory factory = new PizzaSimpleFactory();
        Pizzeria pizzeria = new Pizzeria(factory);

        pizzeria.ordenarPizza("carnes");
        pizzeria.ordenarPizza("queso");
        pizzeria.ordenarPizza("hawai");
    }
}