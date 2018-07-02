<?php
abstract class Beberage {
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