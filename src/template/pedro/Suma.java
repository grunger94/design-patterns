package template.pedro;

class Suma extends Operacion {
    Suma(Integer redondeo) {
        this.redondeo = redondeo;
    }

    void getOperacion() {
        System.out.println("operación: suma");
    }

    void calcula() {
        resultado = primerValor + segundoValor;
    }
}