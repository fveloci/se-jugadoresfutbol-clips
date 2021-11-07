(import se.jugadoresfutbol.models.*)

(deftemplate Persona (declare (from-class Persona)))
(deftemplate Jugador (declare (from-class Jugador)))

(defrule esLautaro
    (Persona            
            (altura ?altura&: (and (>= ?altura 170 ) (<= ?altura 179)))
            (region ?region&: (eq ?region "Sudamerica"))
    )        
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Delantero"))
            (estiloJuego ?estilo&: (eq ?estilo "Tecnico"))
    )
    => (printout t "Tu jugador debe ser Lautaro Martinez" crlf)    
)

(defrule esHaaland
    (Persona 
            (altura ?altura&: (> ?altura 190))
            (region ?region&: (eq ?region "Europa"))
    )
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Delantero"))
            (estiloJuego ?estilo&: (eq ?estilo "Veloz"))
    )
    => (printout t "Tu jugador debe ser Erling Haaland" crlf)    
)

(defrule esSon
    (Persona 
            (altura ?altura&: (and (>= ?altura 180) (<= ?altura 189)))
            (region ?region&: (eq ?region "Asia"))
    )
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Delantero"))
            (estiloJuego ?estilo&: (eq ?estilo "Regateador"))
    )
    => (printout t "Tu jugador debe ser Heung Ming Son" crlf)    
)

(defrule esKante
    (Persona 
            (altura ?altura&: (or (and (>= ?altura 163) (<= ?altura 179)) (eq ?altura 0)))
            (region ?region&: (eq ?region "Europa"))
    )
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Mediocampista defensivo"))
            (estiloJuego ?estilo&: (eq ?estilo "Anticipo"))
    )
    => (printout t "Tu jugador debe ser N´golo Kante" crlf)    
)
(defrule esCourtois
    (Persona 
            (altura ?altura&: (>= ?altura 190))
            (region ?region&: (eq ?region "Europa"))
    )
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Arquero"))            
    )
    => (printout t "Tu jugador debe ser Thibout Courtois" crlf)    
)

(defrule esCuti
    (Persona
            (altura ?altura&: (>= ?altura 180))
            (region ?region&: (eq ?region "Sudamerica"))
    )
    (Jugador
            (posicion ?posicion&: (eq ?posicion "Defensor central"))
    )
    => (printout t "Tu jugador debe ser Cristian CUTI Romero" crlf) 
)

; Si se dejan los campos default como estan
(defrule esCualquiera
    (Persona 
            (altura ?altura&: (>= ?altura 210))
            (region ?region&: (eq ?region "Cualquiera"))
    )
    (Jugador 
            (posicion ?posicion&: (eq ?posicion "Cualquiera"))
            (estiloJuego ?estilo&: (eq ?estilo "Cualquiera"))
    )
    => (printout t "Por favor especifique mas caracteristicas." crlf)    
)

