package template.pedro;

class Multiplicacion extends Operacion {
    Multiplicacion(Integer redondeo) {
        this.redondeo = redondeo;
    }

    void getOperacion() {
        System.out.println("operación: multiplicación");
    }

    void calcula() {
        resultado = primerValor * segundoValor;
    }
}