<?php
require_once "Beverage.php"; 

class Leche extends Beverage {
    
    public function __construct() {
        $this->limiteEdad = 0;
        $this->nombreBebida ="Leche";
    }    
}
?>