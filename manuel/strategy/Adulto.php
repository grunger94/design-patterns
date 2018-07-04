<?php 
    class Adulto extends Persona{

    	public function __construct($edad, Bebida $bebida){
    		$this->nombre = 'Adulto';
    		parent::__construct($edad, $bebida);
    	}
    }
?>