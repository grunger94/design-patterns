package template.pedro;

class Suma extends Operacion {
    Suma() {
    }

    Suma(int redondeo) {
        this.redondeo = redondeo;
    }

    void getOperacion() {
        System.out.println("operación: suma");
    }

    void calcula() {
        resultado = primerValor + segundoValor;
    }
}
