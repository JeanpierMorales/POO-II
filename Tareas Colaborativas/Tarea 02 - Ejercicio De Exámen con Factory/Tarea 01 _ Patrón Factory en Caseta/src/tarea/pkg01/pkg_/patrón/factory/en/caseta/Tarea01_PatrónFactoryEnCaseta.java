package tarea.pkg01.pkg_.patrón.factory.en.caseta;

public class Tarea01_PatrónFactoryEnCaseta {

    public static void main(String[] args) {
        // Creamos un objeto Examen
        Examen examen = new Examen();

        // Aplicamos el examen con la cantidad de preguntas que deseemos
        // En este caso colocamos 5 como ejemplo
        examen.aplicarExamen(5);
    }

}
