package semana.iii.ejercicio.gestion.estudiantes.mvc;

public class Estudiante {
    // Clase que representa la entidad de dominio
    // Entidad - Grupo de datos de preferencia bajo el que se trabajará el sistema
    
    // Atributos 
    private String nombre; 
    private int edad;
    
    // Método constructor de la clase

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    // Métodos de acceso 

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
 
    
}
