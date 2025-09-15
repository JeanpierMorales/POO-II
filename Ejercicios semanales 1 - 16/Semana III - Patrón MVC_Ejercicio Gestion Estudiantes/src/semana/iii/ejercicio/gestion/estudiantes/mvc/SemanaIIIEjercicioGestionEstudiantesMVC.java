package semana.iii.ejercicio.gestion.estudiantes.mvc;

public class SemanaIIIEjercicioGestionEstudiantesMVC {

    public static void main(String[] args) {
        Estudiante modelo = new Estudiante("Jeanpier", 19);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        controlador.actualizarVista();

        controlador.actualizarEdad(20);
        controlador.actualizarNombre("Morales");
        controlador.actualizarVista();
    }

}
