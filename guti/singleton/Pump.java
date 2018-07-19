
/**
 * Pump
 */
package singleton;

import singleton.Tank;

public class Pump {
    private Tank gasTank;

    public Pump(Tank Tanque) {
        gasTank = Tanque;
    }

    public void fillCar(double cantidad) {
        if (gasTank.fill(cantidad)) {
            System.out.println("Atendido: Se cargaron " + cantidad + " litros.");
        } else {
            System.out.println("No hay suficiente combustible, lo sentimos");
        }
    }
}