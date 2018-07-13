<?php 
	require_once "Operacion.php";
	
	class Multiplicacion extends Operacion{
		public function calcula()
		{
			$valor1 = $this->valor1;
			$valor2 = $this->valor2;
			$this->resultado = $valor1 * $valor2;
			// return $this->valor1 - $this->valor2;
		}

		public function getOperacion()
		{
			echo 'Multiplicacion <br/>';
		}
	}
?>