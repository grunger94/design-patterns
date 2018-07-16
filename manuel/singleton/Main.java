public class Main
{
	public static void main(String[] args)
	{
		Celular celular = new Celular("3148583224");
		Dispositivo iPhone = new Dispositivo("iPhone", celular);
		Dispositivo appleWatch = new Dispositivo("Apple Watch", celular);

		iPhone.mostrarInfo();
		appleWatch.mostrarInfo();
	}
}