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
public class Adulto implements Etapa{
    @Override
    public String getEtapa(){
        return "adulto";
    }
    @Override
    public boolean getMayorDeEdad(){
        return true;
    }
}
