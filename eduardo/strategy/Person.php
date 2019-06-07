<?php  
	abstract class Persona{
		public $bebida;
		public $tipoPersona;
		public $edad;

		function setBebida(Bebida $bebida){
			if($bebida->mayorEdad && $this->edad < 18){
				$this->bebida = new jugo();
				return;
			}
			$this->bebida = $bebida;
		}

		function beber(){
			echo "<p>Hola, soy {$this->tipoPersona} ({$this->edad}), y tomo {$this->bebida->getBebida()}.</p>";
		}
	}
?>