/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.jugadoresfutbol;

import se.jugadoresfutbol.models.Jugador;
import se.jugadoresfutbol.models.Persona;
import se.jugadoresfutbol.motor.MotorController;

/**
 *
 * @author VELOCI
 */
public class SEJugadoresFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Persona pruebaLautaro = new Persona("Lautaro Martinez", "Sudamerica", 170);
        Jugador jugadorLautaro = new Jugador("Lautaro Martinez", "Delantero", "Tecnico");
        Persona pruebaHaaland = new Persona("Erling Haaland", "Europa", 192);
        Jugador jugadorHaaland = new Jugador("Erling Haaland", "Delantero", "Veloz");        
        //motor.ejecutar(pruebaLautaro,jugadorLautaro); 
        //motor.ejecutar(pruebaHaaland,jugadorHaaland);*/
        MotorController motor = MotorController.getInstance();
        motor.ejecutar();
    }
    
}
