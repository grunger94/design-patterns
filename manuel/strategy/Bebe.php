<?php 
    class Bebe extends Persona{
    	public function __construct($edad){
    		$this->nombre = 'Adulto';
    		$this->edad = $edad;
    		$this->bebida = new Leche();
    	}
    }
?>