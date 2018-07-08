package template.pedro;

class App {
    public static void main(String[] args) {
        double primerValor = 5d;
        double segundoValor = 3d;

        Operacion operacion = new Suma(3);
        operacion.ejecuta(primerValor, segundoValor);

        operacion = new Resta(null);
        operacion.ejecuta(primerValor, segundoValor);

        operacion = new Multiplicacion(2);
        operacion.ejecuta(primerValor, segundoValor);

        operacion = new Division(1);
        operacion.ejecuta(primerValor, segundoValor);

        primerValor = 5.2d;
        segundoValor = 0d;

        operacion = new Suma(0);
        operacion.ejecuta(primerValor, segundoValor);

        operacion = new Resta(1);
        operacion.ejecuta(primerValor, segundoValor);

        operacion = new Multiplicacion(2);
        operacion.ejecuta(primerValor, segundoValor);

        operacion = new Division(null);
        operacion.ejecuta(primerValor, segundoValor);
    }
}