<?php 
    require_once "Operacion.php";
    
    class Division extends Operacion{
        public $enFraccion;

        public function calcula()
        {
            if (!$this->enFraccion){
                $this->resultado = $this->valor1 / $this->valor2;
            }else{                
                $entero = floor($this->valor1 / $this->valor2);
                $numerador = ($this->valor1 % $this->valor2);
                $denominador = $this->valor2;
                
                if ($entero != 0)
                    $this->resultado = "<b>$entero</b> $numerador/$denominador";
                else
                    $this->resultado = "$numerador/$denominador";
            }
        }

        public function getOperacion()
        {
            echo 'Division <br/>';
        }

        protected function enFraccion()
        {
            return true;
        }
    }
?>