package tarea.pkg01.pkg_.patrón.factory.en.caseta;

import java.io.BufferedReader; // Lee el texto del archivo linea por lines
import java.io.FileReader; // Permite la lectura de archivos de text
import java.io.IOException; // Meneja lo errores causadas por la existencia o no del archivo
import java.util.ArrayList; // Lista dinamica para las preguntas
import java.util.Collections; // Permite la mesca de tipos de preguntas con el shuffle
import java.util.List; // Sirve para las listas dinamicas
import java.util.Scanner; // Para la entrada de texto por teclado

public class Examen {

    private List<Pregunta> preguntas; // Declaración del atributo de lista

    public Examen() {
        preguntas = new ArrayList<>();
    }

    private void cargarPreguntasDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Pregunta pregunta = PreguntaFactory.crearPregunta(linea);
                preguntas.add(pregunta);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de preguntas: " + e.getMessage());
        }
    }

    // Método mostrar el encabezado del examen
    private void mostrarEncabezadoExamen(int cantidadPreguntas) {
        System.out.println("=======================================");
        System.out.println("          EXAMEN DE POO");
        System.out.println("=======================================");
        System.out.println("Número de preguntas: " + cantidadPreguntas);
        System.out.println("Responda cada una según el formato indicado.\n");
    }

    // Método para mostramos preguntas y recogemos respuestas
    private List<String> preguntar(List<Pregunta> seleccionadas, Scanner sc) {
        List<String> respuestasEstudiante = new ArrayList<>();
        int numero = 1;
        for (Pregunta p : seleccionadas) {
            System.out.println("---------------------------------------");
            System.out.println("Pregunta " + numero + ":");
            p.mostrarPregunta();
            String respuestaEstudiante = sc.nextLine();
            respuestasEstudiante.add(respuestaEstudiante);
            numero++;
        }
        return respuestasEstudiante;
    }

    // Método para mostramos el resumen del examen
    private void mostrarResumen(List<Pregunta> seleccionadas, List<String> respuestasEstudiante, int cantidadPreguntas) {
        System.out.println("\n=======================================");
        System.out.println("            RESUMEN DEL EXAMEN");
        System.out.println("=======================================\n");

        for (int i = 0; i < seleccionadas.size(); i++) {
            Pregunta p = seleccionadas.get(i);
            String respuestaEstudiante = respuestasEstudiante.get(i);

            System.out.println("---------------------------------------");
            System.out.println("Pregunta " + (i + 1) + ": " + p.getEnunciado());
            System.out.println("Tu respuesta: " + respuestaEstudiante);

            if (p.evaluarRespuesta(respuestaEstudiante)) {
                System.out.println("Resultado: Correcto");
            } else {
                System.out.println("Resultado: Incorrecto");
                System.out.println("Respuesta correcta: " + p.getRespuestaCorrecta());
            }
        }
    }

    // Mpetodo para calculamos el puntaje total
    private int calcularPuntaje(List<Pregunta> seleccionadas, List<String> respuestasEstudiante, int cantidadPreguntas) {
        int puntaje = 0;
        for (int i = 0; i < seleccionadas.size(); i++) {
            Pregunta p = seleccionadas.get(i);
            String respuestaEstudiante = respuestasEstudiante.get(i);
            if (p.evaluarRespuesta(respuestaEstudiante)) {
                puntaje += 20 / cantidadPreguntas;
            }
        }
        return puntaje;
    }

    // Métodomostramos la nota final
    private void mostrarNotaFinal(int puntaje) {
        System.out.println("\n=======================================");
        System.out.println("           NOTA FINAL");
        System.out.println("=======================================");
        System.out.println("Tu puntaje final es: " + puntaje + " / 20");    
        System.out.println("=======================================");
    }

    // Método principal del examen 
    // Método principal del examen: controla todo el flujo
    public void aplicarExamen(int cantidadPreguntas) {
        // Cargamos las preguntas desde el archivo.txt
        cargarPreguntasDesdeArchivo("src\\tarea\\pkg01\\pkg_\\patrón\\factory\\en\\caseta\\preguntas.txt");

        // Mezclamos aleatoriamente el orden de las preguntas para que cada examen sea diferente
        Collections.shuffle(preguntas); 

        // Seleccionamos solo la cantidad indicada de preguntas sin pasarnos del total disponible
        List<Pregunta> seleccionadas = preguntas.subList(0, Math.min(cantidadPreguntas, preguntas.size()));

        Scanner sc = new Scanner(System.in);

        // Mostramos el encabezado del examen (título, instrucciones, número de preguntas, etc.)
        mostrarEncabezadoExamen(cantidadPreguntas);

        // Mostramos las preguntas una por una y guardamos las respuestas del estudiante
        List<String> respuestasEstudiante = preguntar(seleccionadas, sc);

        // Al terminar, mostramos un resumen de cada pregunta con la respuesta del alumno y la correcta
        mostrarResumen(seleccionadas, respuestasEstudiante, cantidadPreguntas);

        // Calculamos la nota en base a respuestas correctas (máximo 20)
        int puntaje = calcularPuntaje(seleccionadas, respuestasEstudiante, cantidadPreguntas);

        // Finalmente mostramos la nota obtenida
        mostrarNotaFinal(puntaje);
    }
}
