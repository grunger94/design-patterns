<?php 
	abstract class Bebida{
		protected $nombre;
		protected $edadBase;

		public function getNombre(){
			return $this->nombre;
		}

		public function getEdadBase(){
			return $this->edadBase;
		}
	}
?>