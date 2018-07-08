package template.pedro;

class Division extends Operacion {
    Division(Integer redondeo) {
        this.redondeo = redondeo;
    }

    void getOperacion() {
        System.out.println("operación: división");
    }

    void calcula() {
        if (segundoValor == 0) {
            System.out.println("división por cero");
            return;
        }

        resultado = primerValor / segundoValor;
    }
}