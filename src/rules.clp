(import se.jugadoresfutbol.models.*)

(deftemplate Persona (declare (from-class Persona)))
(deftemplate Jugador (declare (from-class Jugador)))

(defrule esLautaro
    (Persona 
            (nombre ?nombre)
            (altura ?altura&: (>= ?altura 170))
            (region ?region&: (eq ?region "Sudamerica"))
    )        
    => (printout t ?nombre crlf)    
)

(defrule esHaaland
    (Persona 
            (nombre ?nombre)
            (altura ?altura&: (> ?altura 190))
            (region ?region&: (eq ?region "Europa"))
    )
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Delantero"))
            (estiloJuego ?estilo&: (eq ?estilo "Veloz"))
    )
    => (printout t "Tu jugador es: " ?nombre crlf)    
)