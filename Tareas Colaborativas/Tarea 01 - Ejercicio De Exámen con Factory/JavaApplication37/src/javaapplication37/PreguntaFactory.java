package javaapplication37;

import java.util.Arrays; // Importamos Arrays para usar split en las opciones
import java.util.List;   // Importamos List para manejar las opciones en OM

// Factory que crea preguntas en base a los datos de texto
// Nosotros consideramos usar este patrón porque nos permite centralizar
// la lógica de creación de objetos según el tipo de pregunta.
public class PreguntaFactory {

    // Método estático: recibe una línea del archivo y devuelve una pregunta concreta
    public static Pregunta crearPregunta(String linea) {
        // Dividimos la línea con split por el separador "|"
        String[] partes = linea.split("\\|");
        String tipo = partes[0]; // El tipo de pregunta (OM, VF, CO)
        String enunciado = partes[1]; // El enunciado
        String respuestaCorrecta = partes[2]; // La respuesta correcta

        // Usamos switch para decidir qué tipo de pregunta crear
        switch (tipo) {
            case "OM": // Opción múltiple
                // Partes[3] contiene las opciones separadas por coma
                List<String> opciones = Arrays.asList(partes[3].split(","));
                return new PreguntaOpcionMultiple(enunciado, respuestaCorrecta, opciones);

            case "VF": // Verdadero/Falso
                return new PreguntaVoF(enunciado, respuestaCorrecta);

            case "CO": // Completar
                return new PreguntaCompletar(enunciado, respuestaCorrecta);

            default:
                // Si el tipo no es válido, lanzamos excepción
                throw new IllegalArgumentException("Tipo de pregunta no válido: " + tipo);
        }
    }
}
