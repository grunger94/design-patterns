<?php
require_once "Operation.php";

class Substract extends Operation {
    public function __construct($round=false) {
        $this->operation = "<b>RESTA</b>";
        $this->round = $round;
    }

    public function compute() {
        $this->result = $this->value1 - $this->value2;
    }

    public function showResult() {
        echo "CALCULO:<br>" . $this->value1 . " - " .$this->value2 . " = <b>" .$this->result . "</b><br><br>";
    }
}
?>