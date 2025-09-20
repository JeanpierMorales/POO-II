package tarea.pkg01.pkg_.patrón.factory.en.examen;

import java.util.List; // Importamos List porque necesitamos manejar una lista de opciones

// Clase hija para preguntas de opción múltiple
// Aquí creemos conveniente guardar todas las opciones en una lista
// para poder mostrarlas dinámicamente con un bucle.
public class PreguntaOpcionMultiple extends Pregunta {
    
    // Lista que contiene todas las opciones de la pregunta
    private List<String> opciones;

    // Constructor: inicializamos atributos heredados y además las opciones
    public PreguntaOpcionMultiple(String enunciado, String respuestaCorrecta, List<String> opciones) { // Añadimos el parametro de las opciones
        super(enunciado, respuestaCorrecta);
        this.opciones = opciones;
    }

    @Override
    public void mostrarPregunta() {
        // Mostramos el enunciado y las opciones numeradas
        System.out.println("=== Pregunta de Opción Múltiple ===");
        System.out.println(getEnunciado());

        // Usamos un bucle for clásico porque necesitamos el índice (i)
        // para mostrar el número de cada opción.
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ") " + opciones.get(i));
        }
        System.out.print("Tu respuesta: ");
    }

    @Override
    public boolean evaluarRespuesta(String respuestaEstudiante) {
        // Comparamos la respuesta ignorando mayúsculas/minúsculas
        return respuestaEstudiante.equalsIgnoreCase(getRespuestaCorrecta());
    }
}
