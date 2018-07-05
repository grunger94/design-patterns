<?php
    abstract class Persona{
        protected $bebida;
        protected $edad;
        protected $nombre;

        public function beber(){
            if ($this->edad < $this->bebida->getEdadBase()){
                echo "No puedo beber ".strtolower($this->bebida->getNombre());
            }else{
                echo "Hola soy una persona de ".$this->edad." años y estoy 
                    bebiendo ".strtolower($this->bebida->getNombre());
            }
        }

        public function setBebida(Bebida $bebida){
            $this->bebida = $bebida;
        }
    }
?>