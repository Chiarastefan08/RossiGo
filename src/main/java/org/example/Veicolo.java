package org.example;

public abstract class Veicolo {
    protected String codice;
    protected double batteria;
    protected enum Stato {
        LIBERO,
        IN_USO,
        IN_RICARICA
    };
    protected Stato stato;

    protected Veicolo(String codice, double batteria){
        this.codice = codice;
        this.batteria = batteria;
        stato = stato.LIBERO;
    }

    protected void getStato(Stato s) throws Exception{
        switch (s) {
            case LIBERO -> stato = stato.LIBERO;
            case IN_USO -> stato = stato.IN_USO;
            case IN_RICARICA -> stato = Stato.IN_RICARICA;
            default -> throw new Exception();
        }

    }

    abstract public double calcolaCosto(int minuti);
    abstract double consumoBatteriaPerMinuto();
}
