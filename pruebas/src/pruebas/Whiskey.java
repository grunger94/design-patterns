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
public class Whiskey implements Bebida{
    String bebida="Whiskey";
    
    @Override
    public String getBebida(){
        return bebida;
    }
    @Override
    public void setBebida (String setBebida){
        bebida = setBebida;
    }
    @Override
    public boolean getAlcoholica(){
        return true;
    }
}
