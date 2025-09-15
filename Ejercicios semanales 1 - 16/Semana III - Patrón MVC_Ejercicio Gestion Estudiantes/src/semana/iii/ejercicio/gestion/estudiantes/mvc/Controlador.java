package semana.iii.ejercicio.gestion.estudiantes.mvc;

public class Controlador {
    
    // Atributos de instancia del modelo y la vista
    private Vista vista;
    private Estudiante estudiante;

    // Constructor del controlador
    public Controlador(Vista vista, Estudiante estudiante) {
        this.vista = vista;
        this.estudiante = estudiante;
    }

    public void actualizarNombre(String nombre){
        estudiante.setNombre(nombre);
    }
    public void actualizarEdad(int edad){
        estudiante.setEdad(edad);
    }
    
    public void actualizarVista(){
        vista.mostrarDataEstudiante(estudiante.getNombre(), estudiante.getEdad());
    }
    
    

}
