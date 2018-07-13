<?php 
	require_once "Operacion.php";
	
	class Resta extends Operacion{
		public function calcula()
		{
			$this->resultado = $this->valor1 - $this->valor2;
		}

		public function getOperacion()
		{
			echo 'Resta <br/>';
		}
	}
?>