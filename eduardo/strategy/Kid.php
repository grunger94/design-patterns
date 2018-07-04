<?php  
	class Niño extends Persona{
		public function __construct($edad){
			$this->tipoPersona = "Niño";
			$this->edad = $edad;
		}
	}
?>