<?php
require "Persona.php"; 

class Bendicion extends Persona {
    public function __construct($edad) {
        $this->edad = $edad;
        $this->quienEs = "Bebé";
    }
}
?>