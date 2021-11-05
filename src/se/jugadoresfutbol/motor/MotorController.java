/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.jugadoresfutbol.motor;

import jess.JessException;
import jess.Rete;
import se.jugadoresfutbol.models.Jugador;
import se.jugadoresfutbol.models.Persona;

/**
 *
 * @author VELOCI
 */
public class MotorController {
    Rete motor;
    
    private static MotorController instance;
    
    private MotorController() {
        try {
            motor = new Rete();
            motor.reset();
            motor.batch("facts.clp");
        } catch (JessException e) {
            System.out.println(e.toString());
        }
    }
    
    public static MotorController getInstance() {
        if (instance == null){
            instance = new MotorController();
        }
        return instance;
    }
    
    public void ejecutar(Persona p, Jugador j) {
        try {
            motor.add(p);
            motor.add(j);
            motor.run();
        } catch (JessException e) {
            System.out.println(e.toString());
        }
    }
}
