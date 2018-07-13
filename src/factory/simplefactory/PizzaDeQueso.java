package factory.simplefactory;

class PizzaDeQueso extends Pizza {

    @Override
    void preparar() {
        System.out.println("Preparando pizza de queso: agregando mozzarella, crema, provolone");
    }

    @Override
    void cocinar() {
        System.out.println("Cocinando por 10 minutos a 300 grados");
    }
}
