package strategy.pedro;

import strategy.pedro.bebida.Agua;
import strategy.pedro.bebida.Bebida;
import strategy.pedro.bebida.Cerveza;
import strategy.pedro.bebida.NingunaBebida;
import strategy.pedro.bebida.Refresco;
import strategy.pedro.persona.Adolescente;
import strategy.pedro.persona.Adulto;
import strategy.pedro.persona.Ninio;
import strategy.pedro.persona.Persona;

import java.util.ArrayList;

public class App {
    static ArrayList<Persona> personas = new ArrayList<>();
    
    public static void main(String args[]) {
        agregaPersonaYBebida(new Ninio(), new NingunaBebida());
        agregaPersonaYBebida(new Adolescente(), new NingunaBebida());
        agregaPersonaYBebida(new Adulto(), new NingunaBebida());

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
        persona.setBebida(bebida);
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
