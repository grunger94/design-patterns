package singleton;

public class DemoCompra {

    public static void main(String[] args) {
        Tarjeta tarjeta = Tarjeta.getInstance();
        tarjeta.setBalance(1000);

        Cliente cliente1 = new Cliente(tarjeta);

        Tarjeta tarjetaAdicional = Tarjeta.getInstance();
        Cliente cliente2 = new Cliente(tarjetaAdicional);

        compra(cliente1, 100);
        compra(cliente2, 100);
    }

    private static void compra(Cliente cliente, double monto) {
        cliente.compra(monto);
        System.out.println(cliente.getTarjeta().getBalance());
    }
}
