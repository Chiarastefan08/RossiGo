package org.example;

public class BatteriaScaricaException extends RossiGoException {
    public BatteriaScaricaException(){
      super("batteria sotto 15%");
    }

    public String getLivelloAttuale(Veicolo veicolo){
      return ("batteria al" + veicolo.batteria + ", scegliere un altro mezzo");
    }
}
