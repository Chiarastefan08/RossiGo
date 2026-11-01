package org.example;

import it.kamaladafrica.codicefiscale.CodiceFiscale;

import static org.example.Veicolo.Stato.IN_RICARICA;

public class FlottaService {
    Veicolo [] veicoli = new Veicolo[] {};
    Utente [] utenti = new Utente[] {};
    Noleggio [] noleggi = new Noleggio[] {};

    public FlottaService(Veicolo[] veicoli, Utente[] utenti, Noleggio[] noleggi){
        this.noleggi = noleggi;
        this.utenti = utenti;
        this.noleggi = noleggi;
    }

    public void registraVeicolo(Veicolo v) throws VeicoloNonDisponibileException{
        for(int i = 0; i < veicoli.length; i++){
            if(veicoli[i] == null){
                veicoli[i] = v;
                break;
            }
        }
    }

    public void registraUtente(Utente u) throws CodiceFiscaleNonValidoException{
        for(int i = 0; i < utenti.length ; i++){
            if(utenti[i] == null){
                utenti[i] = u;
                break;
            }
        }
        if (!CodiceFiscale.isFormatValid(u.getCodiceFiscale())) {
            throw new CodiceFiscaleNonValidoException();
        }
    }

    public void sbloccaVeicolo(String codice, int idUtente) throws VeicoloNonDisponibileException{

    }

    public void terminaNoleggio(String codice, int minutiUsati){

        for(int i = 0; i < veicoli.length; i++){
            if(veicoli[i].codice == codice){
                Veicolo v = veicoli[i];
                double soldi = v.calcolaCosto(minutiUsati) + 1 - v.consumoBatteriaPerMinuto();
            }
        }
    }

    public void mettiInRicarica(String codice){
        for(int i = 0; i < veicoli.length; i++){
            if(veicoli[i].codice == codice){
                Veicolo v = veicoli[i];
                v.stato = IN_RICARICA;
            }
        }
    }



}
