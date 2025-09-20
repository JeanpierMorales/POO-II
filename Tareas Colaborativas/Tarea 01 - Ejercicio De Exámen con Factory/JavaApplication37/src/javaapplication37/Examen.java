package javaapplication37;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Examen {

    private List<Pregunta> preguntas;

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

    // Nuevo método: mostramos el encabezado del examen
    private void mostrarEncabezadoExamen(int cantidadPreguntas) {
        System.out.println("=======================================");
        System.out.println("          EXAMEN DE POO");
        System.out.println("=======================================");
        System.out.println("Número de preguntas: " + cantidadPreguntas);
        System.out.println("Responda cada una según el formato indicado.\n");
    }

    // Nuevo método: mostramos preguntas y recogemos respuestas
    private List<String> preguntar(List<Pregunta> seleccionadas, Scanner sc) {
        List<String> respuestasUsuario = new ArrayList<>();
        int numero = 1;
        for (Pregunta p : seleccionadas) {
            System.out.println("---------------------------------------");
            System.out.println("Pregunta " + numero + ":");
            p.mostrarPregunta();
            String respuestaUsuario = sc.nextLine();
            respuestasUsuario.add(respuestaUsuario);
            numero++;
        }
        return respuestasUsuario;
    }

    // Nuevo método: mostramos el resumen del examen
    private void mostrarResumen(List<Pregunta> seleccionadas, List<String> respuestasUsuario, int cantidadPreguntas) {
        System.out.println("\n=======================================");
        System.out.println("            RESUMEN DEL EXAMEN");
        System.out.println("=======================================\n");

        for (int i = 0; i < seleccionadas.size(); i++) {
            Pregunta p = seleccionadas.get(i);
            String respuestaUsuario = respuestasUsuario.get(i);

            System.out.println("---------------------------------------");
            System.out.println("Pregunta " + (i + 1) + ": " + p.getEnunciado());
            System.out.println("Tu respuesta: " + respuestaUsuario);

            if (p.evaluarRespuesta(respuestaUsuario)) {
                System.out.println("Resultado: Correcto");
            } else {
                System.out.println("Resultado: Incorrecto");
                System.out.println("Respuesta correcta: " + p.getRespuestaCorrecta());
            }
        }
    }

    // Nuevo método: calculamos el puntaje total
    private int calcularPuntaje(List<Pregunta> seleccionadas, List<String> respuestasUsuario, int cantidadPreguntas) {
        int puntaje = 0;
        for (int i = 0; i < seleccionadas.size(); i++) {
            Pregunta p = seleccionadas.get(i);
            String respuestaUsuario = respuestasUsuario.get(i);
            if (p.evaluarRespuesta(respuestaUsuario)) {
                puntaje += 20 / cantidadPreguntas;
            }
        }
        return puntaje;
    }

    // Nuevo método: mostramos la nota final
    private void mostrarNotaFinal(int puntaje) {
        System.out.println("\n=======================================");
        System.out.println("           NOTA FINAL");
        System.out.println("=======================================");
        System.out.println("Tu puntaje final es: " + puntaje + " / 20");
        System.out.println("=======================================");
    }

    // Método principal del examen (ahora mucho más limpio)
    public void aplicarExamen(int cantidadPreguntas) {
        cargarPreguntasDesdeArchivo("src\\javaapplication37\\preguntas.txt");
        Collections.shuffle(preguntas);

        List<Pregunta> seleccionadas = preguntas.subList(0, Math.min(cantidadPreguntas, preguntas.size()));
        Scanner sc = new Scanner(System.in);

        mostrarEncabezadoExamen(cantidadPreguntas);
        List<String> respuestasUsuario = preguntar(seleccionadas, sc);
        mostrarResumen(seleccionadas, respuestasUsuario, cantidadPreguntas);

        int puntaje = calcularPuntaje(seleccionadas, respuestasUsuario, cantidadPreguntas);
        mostrarNotaFinal(puntaje);
    }
}
