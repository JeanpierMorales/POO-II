package javaapplication37;

// Clase abstracta Pregunta
// Representa una pregunta genérica con enunciado y respuesta correcta
public abstract class Pregunta {

    private String enunciado;
    private String respuestaCorrecta;

    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    // Métodos abstractos que cada tipo de pregunta implementará
    public abstract void mostrarPregunta();

    public abstract boolean evaluarRespuesta(String respuestaUsuario);
}
