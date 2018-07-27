package factory.method.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String nombre;
    public String masa;
    public String salsa;
    public List<String> ingredientes = new ArrayList<>();

    protected void preparar() {
        System.out.println("Preparando pizza " + nombre);
        System.out.println("Volteando masa " + masa);
        System.out.println("Agregando salsa " + salsa);

        for (String ingrediente : ingredientes) {
            System.out.println("Agregando " + ingrediente);
        }
    }

    protected void cocinar() {
        System.out.println("Cocinando por 25 minutos a 350 grados");
    }

    protected void cortarYEmpacar() {
        System.out.println("Cortando en rebanadas diagonales");
        System.out.println("Empacando...");
    }
}
