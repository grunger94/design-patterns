<?php 
	class Cerveza extends Bebida{
		public function __construct(){
			$this->nombre = 'Cerveza';
			$this->paraMenores = false;
		}
	}
?>