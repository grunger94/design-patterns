package template.pedro;

abstract class Operacion {
    protected double primerValor;
    protected double segundoValor;
    protected double resultado;
    protected Integer redondeo = null;

    final void ejecuta(double primerValor, double segundoValor) {
        getOperacion();
        setValores(primerValor, segundoValor);
        calcula();
        muestraResultado();
    }

    abstract void getOperacion();
    abstract void calcula();

    final void setValores(double primerValor, double segundoValor) {
        this.primerValor = primerValor;
        this.segundoValor = segundoValor;
        System.out.println("primer valor: " + this.primerValor);
        System.out.println("segundo valor: " + this.segundoValor);
    }

    final void muestraResultado() {
        if (redondeo != null && redondeo >= 0) {
            System.out.println("redondeo a " + redondeo + " decimales");
            System.out.println("resultado: " + String.format("%." + redondeo + "f", resultado));
        } else {
            System.out.println("sin redondear");
            System.out.println("resultado: " + resultado);
        }

        System.out.println("\n");
    }
}
