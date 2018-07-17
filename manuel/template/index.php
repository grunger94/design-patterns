<?php
	require_once "Suma.php";
	require_once "Resta.php";
	require_once "Multiplicacion.php";
	require_once "Division.php";
	
	$operacion = new Suma();
	$operacion->ejecuta(10,3);

	$operacion = new Resta();
	$operacion->ejecuta(10,3);

	$operacion = new Multiplicacion();
	$operacion->ejecuta(10,3);

	$operacion = new Division(true);
	$operacion->ejecuta(20,3);

	$operacion->setEnFraccion(false);
	$operacion->ejecuta(20,3);
?>