package factory.simple.pedro;

class App {
    public static void main(String[] args) {
        JugueteriaFactory factory = new JugueteriaFactory();
        Jugueteria jugueteria = new Jugueteria(factory);

        jugueteria.muestra("carrito");
        jugueteria.muestra("muñeca");
        jugueteria.muestra("pelota");
    }
}