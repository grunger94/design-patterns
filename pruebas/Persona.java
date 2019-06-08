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
abstract class Persona {
    Etapa etapa;
    Bebida bebida;
    
    void setEtapa(Etapa etapa){
        this.etapa= etapa;
    }
    
    void setBebida(Bebida bebida){
        this.bebida= bebida;
    }
    
    void muestra(){
        System.out.println("hola soy un " + etapa.getEtapa() + " y estoy bebiendo " + bebida.getBebida());
    }
}
