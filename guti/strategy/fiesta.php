<?php
include('Bendicion.php');
include('Leche.php');
include('Puberto.php');
include('Refresco.php');

$persona = new Bendicion(2);
$drink = new Leche();

$persona->getIndetidad();
$persona->beber($drink);


$persona = new Puberto(12);
$drink = new Refresco();

$persona->getIndetidad();
$persona->beber($drink);
?>