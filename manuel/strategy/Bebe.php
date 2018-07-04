<?php 
    class Bebe extends Persona{
    	public function __construct($edad, Bebida $bebida){
    		$this->nombre = 'Bebe';
    		parent::__construct($edad, $bebida);
    	}
    }
?>