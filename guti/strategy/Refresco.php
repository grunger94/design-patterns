<?php
require_once "Beverage.php"; 

class Refresco extends Beverage {
    
    public function __construct() {
        $this->limiteEdad = 12;
        $this->nombreBebida ="Refresco";
    }    
}
?>