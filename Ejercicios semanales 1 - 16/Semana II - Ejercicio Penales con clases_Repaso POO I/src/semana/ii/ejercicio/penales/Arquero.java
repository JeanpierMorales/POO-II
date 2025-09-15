package semana.ii.ejercicio.penales;

import static java.lang.Math.random;
import java.util.Random;

public class Arquero {
    private int dorsal;

    public Arquero(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
    
    public int atajarPenal(){
        Random random = new Random();
        int posArquero = random.nextInt(9)+1;
        System.out.println("El arquero se tiro a la posicion " + posArquero);
        return posArquero; 
    }
}
