import com.github.lalyos.jfiglet.FigletFont;
import org.example.*;

import static java.lang.IO.println;

void main() throws IOException {
    String StringaASCII = FigletFont.convertOneLine("ROSSIGO!");
    System.out.println(StringaASCII);

    Utente u = new Utente(32, "Luca", "luca@gmail.com", "LCU9867", 1);
    Bici bici = new Bici("CA987", 89.9, 5);
    Monopattino monopattino = new Monopattino("CA999", 98.9, 30, false);

    Veicolo[] veicoli = new Veicolo[]{};
    Utente[] utenti = new Utente[]{};
    Noleggio[] noleggi = new Noleggio[]{};
    FlottaService flotta = new FlottaService(veicoli, utenti, noleggi);

    try {
        flotta.registraVeicolo(bici);
        println("bici registrata");
    } catch (VeicoloNonDisponibileException e) {
        println("la bici non è registrata");
    }


    try {
        flotta.sbloccaVeicolo("CA987", 32);
        println("veicolo sbloccato");
    }catch(VeicoloNonDisponibileException e){
        println("non è possbile sbloccare il veicolo");
    }

    try {
        flotta.registraUtente(u);
        println("utente registrato");
    }catch(CodiceFiscaleNonValidoException e){
        println("utente non registrato");
    }

}