<?php

    abstract class Operacion{
        protected $valor1;
        protected $valor2;
        protected $resultado;

        final function ejecuta($valor1, $valor2)
        {
            $this->getOperacion();
            $this->setValores($valor1, $valor2);
            $this->calcula();
            $this->muestraResultado();
            echo "<br/>";
        }

        protected function setValores($valor1, $valor2)
        {
            $this->valor1 = $valor1;
            $this->valor2 = $valor2;
        }
        
        protected function muestraResultado()
        {
            echo "El resultado es: $this->resultado <br>";
        }
        
        protected function enFraccion()
        {
            return false;
        }

        abstract function calcula();
        abstract function getOperacion();
    }

?>