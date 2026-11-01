package org.example;

public class VeicoloNonDisponibileException extends RossiGoException {
    public VeicoloNonDisponibileException(){
        super("il veicolo non è disponibile è è in carica");
    }
}

