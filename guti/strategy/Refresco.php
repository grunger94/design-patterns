<?php
require_once "Beberage.php"; 

class Refresco extends Beberage {
    
    public function __construct() {
        $this->limiteEdad = 12;
        $this->nombreBebida ="Refresco";
    }    
}
?>