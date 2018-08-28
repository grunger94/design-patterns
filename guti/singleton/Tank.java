/**
 * GasStation
 */
package singleton;

public class Tank {

    private static Tank instance = null;
    private double tankLevel = 100;

    private Tank() {
    }

    public static Tank getInstance() {
        if (instance == null) {
            instance = new Tank();
        }

        return instance;
    }

    public double getLevel() {
        return tankLevel;
    }

    public boolean fill(double cantidad) {
        if (cantidad <= tankLevel) {
            tankLevel = tankLevel - cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void showTankLevel() {
        System.out.println("Combustible disponible: " + tankLevel);
    }
}