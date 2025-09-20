package javaapplication37;

// Clase principal con el método main
// Aquí nosotros probamos nuestro examen con las preguntas cargadas.
public class JavaApplication37 {

    public static void main(String[] args) {
        // Creamos un objeto Examen
        Examen examen = new Examen();

        // Aplicamos el examen con la cantidad de preguntas que deseemos
        // En este caso colocamos 2 como ejemplo
        examen.aplicarExamen(2);
    }
}
