package template;

public abstract class BebidaConCafeina {

    public final void preparar() {
        hervirAgua();
        brew();
        vertirAgua();
        agregarEndulzantes();

        if (agregarPiquete()) {
            System.out.println("Ponle piqueton compa!");
        }
    }

    abstract void brew();

    abstract void agregarEndulzantes();

    public final void hervirAgua() {
        System.out.println("Hirviendo agua");
    }
    public final void vertirAgua() {
        System.out.println("Virtiendo en una taza");
    }

    public boolean agregarPiquete() {
        return false;
    }
}
