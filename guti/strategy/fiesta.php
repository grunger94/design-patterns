<?php
include('Bendicion.php');
include('Leche.php');
include('Puberto.php');
include('Refresco.php');

$bebe = new Bendicion(2);
$bibi = new Leche();

$morro = new Puberto(12);
$chesco = new Refresco();

$bebe->getIndetidad();
$bebe->beber($chesco);

$morro->getIndetidad();
$morro->beber($chesco);
?>