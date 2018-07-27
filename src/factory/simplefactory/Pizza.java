package factory.simplefactory;

public abstract class Pizza {

    abstract void preparar();
    abstract void cocinar();

    void cortarYEmpacar() {
        System.out.println("Cortando en rebanadas diagonales");
    }
}