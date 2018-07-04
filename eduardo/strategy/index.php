<?php
	include "Drink.php";
	include "Person.php";
	include "Beer.php";
	include "Juice.php";
	include "Kid.php";
	include "Adult.php";

	$niño = new Niño(12);
	$adulto = new Adulto(29);

	$cerveza = new Cerveza();
	$jugo = new Jugo();

	$niño->setBebida($jugo);
	$niño->beber(); 
	$adulto->setBebida($cerveza);
	$adulto->beber(); 
	$niño->setBebida($cerveza);
	$niño->beber(); 
	$adulto->setBebida($jugo);
	$adulto->beber();
?>