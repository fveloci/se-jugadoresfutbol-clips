/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.jugadoresfutbol.models;

/**
 *
 * @author VELOCI
 */
public class Jugador {
    private Persona persona;
    private String posicion;
    private String estiloJuego;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEstiloJuego() {
        return estiloJuego;
    }

    public void setEstiloJuego(String estiloJuego) {
        this.estiloJuego = estiloJuego;
    }
    
    
}
