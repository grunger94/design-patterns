<?php
require_once "Persona.php"; 

class Puberto extends Persona {

    public function __construct($edad) {
        $this->edad = $edad;
        $this->quienEs = "Adolescente";
    }
}
?>