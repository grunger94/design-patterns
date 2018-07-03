package strategy.pedro;

import strategy.pedro.persona.*;
import strategy.pedro.bebida.*;

import java.util.ArrayList;

public class App {
    static ArrayList<Persona> personas = new ArrayList<>();
    
    public static void main(String args[]) {
        agregaPersonaYBebida(new Ninio(), null);
        agregaPersonaYBebida(new Adolescente(), null);
        agregaPersonaYBebida(new Adulto(), null);

        agregaPersonaYBebida(new Ninio(), new Agua());
        agregaPersonaYBebida(new Adolescente(), new Refresco());
        agregaPersonaYBebida(new Adulto(), new Cerveza());

        agregaPersonaYBebida(new Ninio(), new Refresco());
        agregaPersonaYBebida(new Adolescente(), new Cerveza());
        agregaPersonaYBebida(new Adulto(), new Agua());

        agregaPersonaYBebida(new Ninio(), new Cerveza());
        agregaPersonaYBebida(new Adolescente(), new Agua());
        agregaPersonaYBebida(new Adulto(), new Refresco());

        presentaPersonas(personas);
    }

    static void agregaPersonaYBebida(Persona persona, Bebida bebida) {
        if (bebida != null) {
            persona.setBebida(bebida);
        }
        
        personas.add(persona);
    }

    static void presentaPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            presentate(persona);
        }
    }

    static void presentate(Persona persona) {
        persona.muestra();
        persona.bebe();
        System.out.println("");
    }
}
