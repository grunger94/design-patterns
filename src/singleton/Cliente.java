package singleton;

public class Cliente {

    private Tarjeta tarjeta;

    public Cliente(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void compra(double monto) {
        tarjeta.setBalance(tarjeta.getBalance() - monto);
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }
}
