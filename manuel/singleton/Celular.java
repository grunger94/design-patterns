class Celular
{
	private String numero;
	private static Celular instanciaUnica;

	private Celular(String numero)
	{
		this.numero = numero;
	}

	public static Celular getInstancia(String numero)
	{
		if (instanciaUnica == null) {
			instanciaUnica = new Celular(numero);
		}
		
		return instanciaUnica;
	}

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		numero = numero;
	}
}