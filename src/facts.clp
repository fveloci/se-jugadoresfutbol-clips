(import models.*)

(deftemplate Persona (declare (from-class Persona)))
(deftemplate Jugador (declare (from-class Jugador)))

(defrule esLautaro
    (Persona 
            (altura ?a&: (> ?a "170"))
            (region ?a&: (eq ?a "sudamerica"))
    )
    (Jugador 
            (posicion ?a&: (eq ?a "Delantero"))
            (estiloJuego ?a&: (eq ?a "Tecnico"))
    )    
    => (printout t "Lautaro Martinez" crlf)    
)