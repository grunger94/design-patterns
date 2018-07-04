<?php
    abstract class Persona{
        protected $bebida;
        protected $edad;
        protected $nombre;

        public function __construct($edad, Bebida $bebida){
            $this->edad = $edad;
            $this->bebida = $bebida;
        }

        public function beber(){
            echo "Hola soy una persona de ".$this->edad." años y 
            	estoy bebiendo ".strtolower($this->bebida->getNombre())."<br/>";
        }

        public function setBebida(Bebida $bebida){
            //Es la misma línea pero da error  ¯\_(ツ)_/¯ 
            // $esMenor = ($this->nombre == 'Bebe') || ($this->nombre == 'Adolescente'); 
            $esMenor = ($this->nombre == 'Bebe') || ($this->nombre == 'Adolescente');

            if ($esMenor && $bebida->getNombre() == 'Cerveza'){
                echo "Un ".strtolower($this->nombre)." no puede tomar cerveza <br/>";
            }else{
                $this->bebida = $bebida;
            }
    	}
    }
?>