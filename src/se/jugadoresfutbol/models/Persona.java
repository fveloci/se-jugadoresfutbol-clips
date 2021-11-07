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
public class Persona {
    private String nombre;
    private String region;
    private int altura;

    public Persona(String region, int altura) {
        this.region = region;
        this.altura = altura;
    }   
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
