public class Main
{
	public static void main(String[] args)
	{
		Celular manuel = Celular.getInstancia("3148583224");
		Celular pedro = Celular.getInstancia("3121204265‬");

		Dispositivo iPhone = new Dispositivo("iPhone", manuel);
		Dispositivo huawei = new Dispositivo("Huawei", pedro);

		iPhone.mostrarInfo();
		huawei.mostrarInfo();
	}
}