package singleton;

public class Tarjeta {

    private double balance;
    private static Tarjeta instanciaUnica;

    private Tarjeta() {
    }

    public static Tarjeta getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Tarjeta();
        }

        return instanciaUnica;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
