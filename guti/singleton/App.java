/**
 * App
 */
package singleton;

import singleton.Tank;

public class App {
    public static void main(String[] args) {
        /* GasStation Tanque = GasStation.getInstance(); */
        Pump bomba1 = new Pump(Tank.getInstance());
        bomba1.fillCar(40);

        Pump bomba2 = new Pump(Tank.getInstance());
        bomba2.fillCar(20);

        Pump bomba3 = new Pump(Tank.getInstance());
        bomba2.fillCar(70);

        /* Tanque.showTankLevel(); */
        Tank.getInstance().showTankLevel();
    }

}