package factory.simplefactory;

class PizzaHawaiana extends Pizza {

    @Override
    void preparar() {
        System.out.println("Preparando pizza hawaiana: agregando jamon, piña");
    }

    @Override
    void cocinar() {
        System.out.println("Cocinando por 15 minutos a 280 grados");
    }

    @Override
    void cortarYEmpacar() {
        System.out.println("Cortando en rebanadas cuadradas");
    }
}