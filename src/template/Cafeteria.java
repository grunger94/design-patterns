package template;

public class Cafeteria {

    public static void main(String[] args) {
        BebidaConCafeina bebida = new Cafe(true);
        bebida.preparar();

        bebida = new Te();
        bebida.preparar();
    }
}
