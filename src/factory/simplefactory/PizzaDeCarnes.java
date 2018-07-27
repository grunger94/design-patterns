package factory.simplefactory;

class PizzaDeCarnes extends Pizza {

    @Override
    void preparar() {
        System.out.println("Preparando pizza de carnes: agregando jamon, salami, pepperoni");
    }

    @Override
    void cocinar() {
        System.out.println("Cocinando por 15 minutos a 300 grados");
    }
}