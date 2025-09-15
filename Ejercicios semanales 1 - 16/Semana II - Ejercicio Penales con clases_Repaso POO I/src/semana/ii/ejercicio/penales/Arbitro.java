
package semana.ii.ejercicio.penales;

public class Arbitro {
    // Encargado de verificar la valídez de Gol 
    private String nombre; 

    public Arbitro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void validarGol(int posJugador, int posArquero){
        if(posArquero == posJugador){
            System.out.println("No goal, el arquero atajo el penal!!!");
        }else{
            System.out.println("GOOOOOOOOOOOOOOOOLLLL DE ALIANZA LIMAAAA");
        }
    }
}
