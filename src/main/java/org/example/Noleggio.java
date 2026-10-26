package org.example;

public class Noleggio {
    private Utente utente;
    private Veicolo veicolo;
    private int Orainizio;
    private int OrarioFine;

    public Noleggio(Utente utente, Veicolo veicolo, int OrarioInizio, int OrarioFine){
        this.utente = utente;
        this.veicolo = veicolo;
        this.Orainizio = OrarioInizio;
        this.OrarioFine = OrarioFine;
    }
}
