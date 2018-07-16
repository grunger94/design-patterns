class Dispositivo
{
	protected String nombre;
	protected Celular celular;

	public Dispositivo(String nombre, Celular celular)
	{
		this.nombre = nombre;
		this.celular = celular;
	}

	public void mostrarInfo()
	{
		System.out.println("El dispositivo " + this.nombre + " tiene el numero celular " + this.celular.getNumero());
	}
}