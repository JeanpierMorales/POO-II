
package semana.i.ejercicio.de.covid.pkg19;


public class Ciudad {

    // Encapsulamiento y Abstracción del Programa
    private String nomCiudad;
    private int aFundacion;
    private int cantHabitantes;
    private int persContagiadas;
    private float ratioContagios;

    // Métodos constructores

    public Ciudad() {
        this.nomCiudad = " ";
        this.aFundacion = 0;
        this.cantHabitantes = 0;
        this.persContagiadas = 0;
    }
    
    

    public Ciudad(String nomCiudad, int aFundacion, int cantHabitantes, int persContagiadas) {
        // Un método puede llamar a otros métodos

        this.nomCiudad = nomCiudad;
        this.aFundacion = aFundacion;
        this.cantHabitantes = cantHabitantes;
        this.persContagiadas = persContagiadas;
        // POdemos realizar algunos cálculos dentro del método constructor
        this.ratioContagios = (float) this.persContagiadas / this.cantHabitantes; // Tengo que castear el valor que quiera obtener
    }

    // Metodos de Acceso 
    public String getNomCiudad() {
        return this.nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public int getaFundacion() {
        return this.aFundacion;
    }

    public void setaFundacion(int aFundacion) {
        this.aFundacion = aFundacion;
    }

    public int getCantHabitantes() {
        return this.cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public int getPersContagiadas() {
        return this.persContagiadas;
    }

    public void setPersContagiadas(int persContagiadas) {
        this.persContagiadas = persContagiadas;
    }

    // Método auxiliar de mostrar datos 
    public void mostrarDatos() {
        System.out.println("Nombre de la Ciudad: " + this.nomCiudad);
        System.out.println("Ratio de contagios: " + (this.ratioContagios * 100) + "%");
    }
}
