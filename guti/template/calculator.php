<?php
require_once "Sum.php";
require_once "Substraction.php";
require_once "Multiplication.php";
require_once "Division.php";

$operacion = new Sum();
$operacion->execute(10,10);

$operacion = new Multiplication();
$operacion->execute(10,10);

$operacion = new Division();
$operacion->execute(105.1,9.2);

$operacion = new Division(true);
$operacion->execute(105.1,9.2);

$operacion = new Substraction();
$operacion->execute(20,10);
?>