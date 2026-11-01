package org.example;
import it.kamaladafrica.codicefiscale.CodiceFiscale;

public class Utente {
    private int ID;
    private String nome;
    private String email;
    private String codiceFiscale;
    private int CreditoInEuro;

    public Utente(int ID, String nome, String email, String codiceFiscale, int CreditoInEuro){
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.codiceFiscale = codiceFiscale;
        this.CreditoInEuro = CreditoInEuro;
    }

    public String getCodiceFiscale(){
        return codiceFiscale;
    }

}
