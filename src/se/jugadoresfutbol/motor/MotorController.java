/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.jugadoresfutbol.motor;

import java.io.StringWriter;
import jess.JessException;
import jess.Rete;
import se.jugadoresfutbol.OperacionArchivo;
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
            motor.batch("rules.clp");
            motor.reset();   
            OperacionArchivo.crearArchivo();
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
    
    public String ejecutar(Persona p, Jugador j) {
        try {
            motor.add(p);
            motor.add(j);
            StringWriter stringWriter = new StringWriter();       
            motor.addOutputRouter("t", stringWriter);            
            motor.run();            
            return stringWriter.toString().trim();
        } catch (JessException e) {
            System.out.println(e.toString());
            return "";
        }
    }
    
    public void clearAndReset() {
        try {
            motor.clear();
            motor.batch("rules.clp");
            motor.reset();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
