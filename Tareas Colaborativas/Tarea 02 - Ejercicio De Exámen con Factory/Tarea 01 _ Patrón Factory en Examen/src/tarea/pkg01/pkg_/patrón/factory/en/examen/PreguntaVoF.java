package tarea.pkg01.pkg_.patrón.factory.en.examen;

// Clase hija para preguntas de Verdadero/Falso
// Aquí nosotros simplificamos el proceso mostrando (V/F) como ayuda al Estudiante.
public class PreguntaVoF extends Pregunta {

    // Constructor: inicializamos con el constructor padre
    public PreguntaVoF(String enunciado, String respuestaCorrecta) {
        super(enunciado, respuestaCorrecta);
    }

    @Override
    public void mostrarPregunta() {
        // Mostramos el enunciado indicando que es de V/F
        System.out.println("=== Pregunta de Verdadero/Falso ===");
        System.out.println(getEnunciado() + " (V/F)");
        System.out.print("Tu respuesta: ");
    }

    @Override
    public boolean evaluarRespuesta(String respuestaEstudiante) {
        // Comparamos ignorando mayúsculas o minúsculas
        return respuestaEstudiante.equalsIgnoreCase(getRespuestaCorrecta());
    }
}
