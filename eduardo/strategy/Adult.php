<?php  
	class Adulto extends Persona{
		public function __construct($edad){
			$this->tipoPersona = "Adulto";
			$this->edad = $edad;
		}
	}
?>