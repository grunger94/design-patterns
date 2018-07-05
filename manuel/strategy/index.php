<?php
	require_once 'Persona.php';
	require_once 'Bebida.php';

	require_once 'Adulto.php';
	require_once 'Adolescente.php';
	require_once 'Bebe.php';
	
	require_once 'Leche.php';
	require_once 'Refresco.php';
	require_once 'Cerveza.php';

	$persona = new Adulto(35);
	$persona->beber();
	$persona->setBebida(new Refresco());
	$persona->beber();

	$persona = new Adolescente(13);
	$persona->setBebida(new Cerveza());
	$persona->beber();
	$persona->setBebida(new Leche());
	$persona->beber();

	$persona = new Bebe(1);
	$persona->beber();
	$persona->setBebida(new Cerveza());
	$persona->beber();
?>