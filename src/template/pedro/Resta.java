package template.pedro;

class Resta extends Operacion {
    Resta() {
    }

    Resta(int redondeo) {
        this.redondeo = redondeo;
    }

    void getOperacion() {
        System.out.println("operación: resta");
    }

    void calcula() {
        resultado = primerValor - segundoValor;
    }
}
