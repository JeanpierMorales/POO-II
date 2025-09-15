package semana.ii.ejercicio.penales;

public class SemanaIIEjercicioPenales {

   
    public static void main(String[] args) {
        Jugador jugador = new Jugador(10, "Delantero", "Alianza Lima");
        Arquero arquero = new Arquero(1);
        Arbitro arbitro = new Arbitro("Lucho");
        arbitro.validarGol(jugador.patearPenal(), arquero.atajarPenal());
        
    }
    
}
