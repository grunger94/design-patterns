<?php 
    class Adolescente extends Persona{
    	public function __construct($edad, Bebida $bebida){
    		$this->nombre = 'Adolescente';
    		parent::__construct($edad, $bebida);
    	}
    }
?>