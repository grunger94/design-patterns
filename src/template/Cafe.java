package template;

public class Cafe extends BebidaConCafeina {

    boolean conPiquete;

    public Cafe(boolean conPiqueton) {
        this.conPiquete = conPiqueton;
    }

    public void brew() {
        System.out.println("Vaciando granos en el filtro");
    }

    public void agregarEndulzantes() {
        System.out.println("Agregando leche y azucar");
    }

    @Override
    public boolean agregarPiquete() {
        return conPiquete;
    }
}
