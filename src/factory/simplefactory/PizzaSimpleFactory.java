package factory.simplefactory;

public class PizzaSimpleFactory {

    public Pizza crearPizza(String tipo) {
        Pizza pizza = null;

        if (tipo.equals("queso")) {
            pizza = new PizzaDeQueso();
        } else if (tipo.equals("carnes")) {
            pizza = new PizzaDeCarnes();
        } else if (tipo.equals("hawai")) {
            pizza = new PizzaHawaiana();
        }

        return pizza;
    }
}