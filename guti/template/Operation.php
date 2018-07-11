<?php
abstract class Operation {
    protected $value1;
    protected $value2;
    protected $operation = "";
    protected $result;
    protected $round = false;

    final public function execute($valueOne, $valueTwo) {
        $this->getOperation();
        $this->setValues($valueOne, $valueTwo);
        $this->compute();
        
        if ($this->round)
            $this->rounding();

        $this->showResult();
    }

    public function setValues($val1, $val2) {
        $this->value1 = $val1;
        $this->value2 = $val2;
    }

    public function getOperation() {
        echo "OPERACIÓN: ".$this->operation."<br>";
    }

    public function rounding() {
        $this->result = round($this->result, 2);
    }

    abstract function compute();
    abstract function showResult();
}
?>