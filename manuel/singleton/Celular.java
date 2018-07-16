class Celular
{
	protected Celular instanciaUnica;
	protected String numero;

	public Celular(String numero)
	{
		this.numero = numero;
	}

	public Celular getInstancia()
	{
		if (instanciaUnica == null) {
			this.instanciaUnica = new Celular(this.numero);
		}
		
		return this.instanciaUnica;
	}

	public String getNumero()
	{
		return this.numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}
}