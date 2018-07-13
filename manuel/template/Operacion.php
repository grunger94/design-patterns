<?php

    abstract class Operacion{
        protected $valor1;
        protected $valor2;
        protected $resultado;
        protected $enFraccion;
        
        final function ejecuta($valor1, $valor2)
        {
            $this->getOperacion();
            $this->setValores($valor1, $valor2);
            $this->calcula();
            $this->muestraResultado();
            echo "<br/>";
        }

        private function setValores($valor1, $valor2)
        {
            $this->valor1 = $valor1;
            $this->valor2 = $valor2;
        }
        
        private function muestraResultado()
        {
            echo "El resultado es: $this->resultado <br>";
        }
        
        private function enFraccion()
        {
            return false;
        }

        abstract function calcula();
        abstract function getOperacion();
    }

?>