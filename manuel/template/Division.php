<?php 
    require_once "Operacion.php";
    
    class Division extends Operacion{
        public $enFraccion = true;

        public function calcula()
        {
            if (!$this->enFraccion){
                $valor1 = $this->valor1;
                $valor2 = $this->valor2;
                $this->resultado = $valor1 / $valor2;
            }else{
                $valor1 = $this->valor1;
                $valor2 = $this->valor2;
                
                $entero = floor($valor1 / $valor2);
                $numerador = $valor1 % $valor2;
                $denominador = $valor2;
                
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
            return $enFraccion;
        }
    }
?>