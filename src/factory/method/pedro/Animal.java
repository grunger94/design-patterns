package factory.method.pedro;

public abstract class Animal {
    protected String tipo;
    protected int patas;
    protected int ojos;

    public final void mostrarAtributos() {
        mostrarTipo();
        mostrarOjos();
        mostrarPatas();
        mostrarAntenas();
        System.out.println("\n");
    }

    private void mostrarTipo() {
        System.out.println("soy un " + tipo);
    }

    private void mostrarOjos() {
        System.out.println("tengo " + ojos + " ojos");
    }

    private void mostrarPatas() {
        System.out.println("tengo " + patas + " patas");
    }

    protected void mostrarAntenas() {
        System.out.println("no tengo antenas");
    }
}