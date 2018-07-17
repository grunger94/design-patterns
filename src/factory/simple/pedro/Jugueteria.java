package factory.simple.pedro;

public class Jugueteria {
    private JugueteriaFactory factory;

    public Jugueteria(JugueteriaFactory factory) {
        this.factory = factory;
    }

    public void muestra(String tipo) {
        Juguete juguete = factory.crearJuguete(tipo);
        juguete.get();
    }
}