package tarea.pkg01.pkg_.patrón.factory.en.caseta;

// Creamos la clase abstracta Pregunta
// Representa una pregunta genérica con su enunciado y una respuesta correcta
public abstract class Pregunta {

    // Declaración de atributos 
    private String enunciado;
    private String respuestaCorrecta;

    // Metodo constructor 
    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Métosos auxiliares de acceso, no colocamos set ya que no tendremos que colocar nada dentro del code por el uso de un archivo.txt
    public String getEnunciado() {
        return this.enunciado;// Usamos this para hacer referencia a la propiedad de esta clase
    }

    public String getRespuestaCorrecta() {
        return this.respuestaCorrecta;
    }

    // Métodos abstractos que cada tipo de pregunta implementará individualmente
    public abstract void mostrarPregunta();

    public abstract boolean evaluarRespuesta(String respuestaEstudiante);
}
