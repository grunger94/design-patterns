<?php
	require_once 'Persona.php';
	require_once 'Bebida.php';

	require_once 'Adulto.php';
	require_once 'Adolescente.php';
	require_once 'Bebe.php';
	
	require_once 'Leche.php';
	require_once 'Refresco.php';
	require_once 'Cerveza.php';

	$adulto = new Adulto(35, new Refresco());
	$adulto->beber();
	$adulto->setBebida(new Cerveza());
	$adulto->beber();

	$adolescente = new Adolescente(13, new Refresco());
	$adolescente->setBebida(new Cerveza());
	$adolescente->beber();

	$bebe = new Bebe(1, new Leche());
	$bebe->beber();
	$bebe->setBebida(new Cerveza());
	$bebe->beber();
?>