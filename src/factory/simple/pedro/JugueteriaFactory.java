package factory.simple.pedro;

public class JugueteriaFactory {
    public Juguete crearJuguete(String tipo) {
        Juguete juguete = null;

        if (tipo.equals("carrito")) {
            juguete = new Carrito();
        } else if (tipo.equals("muñeca")) {
            juguete = new Muñeca();
        } else if (tipo.equals("pelota")) {
            juguete = new Pelota();
        }

        return juguete;
    }
}