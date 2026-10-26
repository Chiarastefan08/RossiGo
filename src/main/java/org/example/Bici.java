package org.example;

public class Bici extends Veicolo{
    private int marce;

    public Bici(String codice, double batteria, int marce){
        super(codice, batteria);
        marce = marce;
    }

    @Override
    public double calcolaCosto(int minuti){
        return minuti * 0.15;
    }
    @Override
    public double consumoBatteriaPerMinuto(){
        return 0.2;
    }

    public int getMarce(){
        return marce;
    }




}
