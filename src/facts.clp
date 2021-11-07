(import se.jugadoresfutbol.models.*)

(deffacts Persona
    (Persona (nombre "Lautaro Martinez") (region "Sudamerica") (altura 172)) 
    (Persona (nombre "Erling Haaland") (region "Europa") (altura 192))  
)    

(deffacts Jugador
    (Jugador (posicion "Delantero") (estiloJuego "Tecnico"))
    (Jugador (posicion "Delantero") (estiloJuego "Veloz"))
   
)
