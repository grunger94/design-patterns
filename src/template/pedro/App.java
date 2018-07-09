package template.pedro;

class App {
    private static Operacion operacion;
    private static double primerValor;
    private static double segundoValor;

    public static void main(String[] args) {
        primerValor = 5d;
        segundoValor = 3d;

        operacion = new Suma(3);
        calcula();
        
        operacion = new Resta();
        calcula();

        operacion = new Multiplicacion(2);
        calcula();

        operacion = new Division(1);
        calcula();

        primerValor = 5.2d;
        segundoValor = 0d;

        operacion = new Suma(0);
        calcula();

        operacion = new Resta(1);
        calcula();

        operacion = new Multiplicacion(2);
        calcula();

        operacion = new Division();
        calcula();
    }

    private static void calcula() {
        operacion.ejecuta(primerValor, segundoValor);
    }
}
