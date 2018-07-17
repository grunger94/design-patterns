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
		System.out.println("El dispositivo " + nombre + " tiene el numero celular " + celular.getNumero());
	}
}