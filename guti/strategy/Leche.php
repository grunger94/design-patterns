<?php
require_once "Beberage.php"; 

class Leche extends Beberage {
    
    public function __construct() {
        $this->limiteEdad = 0;
        $this->nombreBebida ="Leche";
    }    
}
?>