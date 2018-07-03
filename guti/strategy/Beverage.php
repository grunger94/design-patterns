<?php
abstract class Beverage {
    protected $nombreBebida;
    protected $limiteEdad;

    public function getBebida() {
        return $this->nombreBebida;
    }

    public function getLimiteEdad() {
        return $this->limiteEdad;
    }
}
?>