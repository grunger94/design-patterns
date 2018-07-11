<?php
require_once "Sum.php";
require_once "Substract.php";
require_once "Multiply.php";
require_once "Division.php";

$operacion = new Sum();
$operacion->execute(10,10);

$operacion = new Multiply();
$operacion->execute(10,10);

$operacion = new Division();
$operacion->execute(105.1,9.2);

$operacion = new Division(true);
$operacion->execute(105.1,9.2);

$operacion = new Substract();
$operacion->execute(20,10);
?>