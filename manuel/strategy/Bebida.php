<?php 
	abstract class Bebida{
		protected $nombre;
		protected $paraMenores;

		public function getNombre(){
			return $this->nombre;
		}

		public function getParaMenores(){
			return $this->paraMenores;
		}
	}
?>