/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Pyckzon
 */
abstract class persona {
    etapa etapa;
    bebida bebida;
    
    void setEtapa(etapa etapa){
        this.etapa= etapa;
    }
    
    void setBebida(bebida bebida){
        this.bebida= bebida;
    }
    
    void muestra(){
        System.out.println("hola soy un " + etapa.etapa() + " y estoy bebiendo " + bebida.bebida());
    }
}
