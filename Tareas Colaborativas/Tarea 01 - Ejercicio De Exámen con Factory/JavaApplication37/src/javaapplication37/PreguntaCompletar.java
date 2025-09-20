package javaapplication37;

// Clase hija para preguntas de completar
// Nosotros decidimos que esta clase sea sencilla: solo mostramos el enunciado
// y pedimos que el usuario escriba la respuesta.
public class PreguntaCompletar extends Pregunta {

    // Constructor: inicializamos los atributos heredados con super()
    public PreguntaCompletar(String enunciado, String respuestaCorrecta) {
        super(enunciado, respuestaCorrecta);
    }

    @Override
    public void mostrarPregunta() {
        // Mostramos el enunciado de la pregunta
        System.out.println("=== Pregunta de Completar ===");
        System.out.println(getEnunciado());
        System.out.print("Tu respuesta: ");
    }

    @Override
    public boolean evaluarRespuesta(String respuestaUsuario) {
        // Comparamos ignorando mayúsculas/minúsculas
        return respuestaUsuario.equalsIgnoreCase(getRespuestaCorrecta());
    }
}
