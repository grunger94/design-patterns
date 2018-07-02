<?php
require_once "Beberage.php"; 

abstract class Persona {
    protected $edad;
    protected $puedeBeber = false;
    protected $quienEs = "";

    public function beber(Beberage $bebida) {
        $this->puedeBeber($bebida->getLimiteEdad());

        if ($this->puedeBeber) {
            echo "Estoy bebiendo ".$bebida->getBebida()."<br>";
        } else {
            echo "No me dejan beber ".$bebida->getBebida()." =( <br>";
        }        
    }

    public function puedeBeber($limite) {
        if ($this->edad >= $limite) 
            $this->puedeBeber = true;
        else 
            $this->puedeBeber = false;        
    }

    public function getEdad() {
        return $this->edad;    
    }

    public function getIndetidad() {
        echo "Soy un ".$this->quienEs.", tengo ".$this->edad." años<br>";   
    }
}
?>