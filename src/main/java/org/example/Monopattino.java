package org.example;

public class Monopattino extends Veicolo{
    private int velocitaMassima;
    private boolean isZonaPedonale;

    public Monopattino(String codice, double batteria, int velocitaMassima, boolean isZonaPedonale){
        super(codice, batteria);
        this.velocitaMassima = velocitaMassima;
        this.isZonaPedonale = isZonaPedonale;
    }

    @Override
    public double calcolaCosto(int minuti){
        return minuti * 0.25;
    }
    @Override
    public double consumoBatteriaPerMinuto(){
        return 0.8;
    }

    public boolean isLimitatoInZonaPedonale(){
        return isZonaPedonale;
    }
}
