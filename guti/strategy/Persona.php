<?php
require_once "Beverage.php"; 

abstract class Persona {
    protected $edad;
    protected $quienEs = "";

    public function beber(Beverage $bebida) {
        
        if ($this->edad >= $bebida->getLimiteEdad()) {
            echo "Estoy bebiendo ".$bebida->getBebida()."<br>";
        } else {
            echo "No me dejan beber ".$bebida->getBebida()." =( <br>";
        }        
    }

    public function getEdad() {
        return $this->edad;    
    }

    public function getIndetidad() {
        echo "Soy un ".$this->quienEs.", tengo ".$this->edad." años<br>";   
    }
}
?>