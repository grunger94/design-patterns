package factory.method.pedro;

public abstract class Animal {
    protected String tipo;
    protected int patas;
    protected int ojos;

    public void mostrarTipo() {
        System.out.println("soy un " + tipo);
    }

    public void mostrarOjos() {
        System.out.println("tengo " + ojos + " ojos");
    }

    public void mostrarPatas() {
        System.out.println("tengo " + patas + " patas");
    }

    public abstract void mostrarAntenas();
}