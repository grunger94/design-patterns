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
public class Carlos extends Persona {
    public Carlos() {
        etapa = new Adulto();
        bebida = new Whiskey();
        if ((bebida.getAlcoholica()& !etapa.getMayorDeEdad())) {
           bebida = new Agua();
        }
    }
}