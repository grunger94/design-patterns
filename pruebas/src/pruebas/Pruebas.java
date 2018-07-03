/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JOptionPane;

/**
 *  ejemplo de pruebas de cajas
 * el programa debe generar un menu con diferentes funciones o ejemplos
 * 1.- operaciones con variables
 * 2.- operaciones con condiciones
 * 3
 * @author Pyckzon
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola soy un adulto y bebo te");
        
        
        persona persona = new carlos();
        persona.muestra();
        
        persona = new manuel();
        persona.muestra();
    }
    
}
