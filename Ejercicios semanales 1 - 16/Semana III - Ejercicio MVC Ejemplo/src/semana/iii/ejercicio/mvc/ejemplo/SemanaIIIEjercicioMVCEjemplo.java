package semana.iii.ejercicio.mvc.ejemplo;

public class SemanaIIIEjercicioMVCEjemplo {

    public static void main(String[] args) {
        
        // Instancio las clase para poder colocarlos dentro del parametro del controlador 
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista); // Insertamos los parametros que esta recibiendo 
       // controlador.menuOperaciones(); // Lamamos a la función que nos permite ejeutar la operación de Suma / Resta / Mult / Div
    }

}
