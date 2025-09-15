package semana.iii.ejercicio.mvc.ejemplo;

import java.util.*;

public class Controlador {

    // El controlador recibe las solicitudes del usuario a través de la vista
    // Coordina entre el modelo y la vista 
    // Procede a instanciar a las dos clases
    private Modelo modelo;
    private Vista vista;

    // Unifica el modelo y la vista en la clase del controlador 
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

public void Ejecutar(int a, int b, int opcionOperacion){

        switch (opcionOperacion) {
            case 1:
                vista.mostrarResultado(modelo.sumar(a, b));
                break;
            case 2:
                vista.mostrarResultado(modelo.sumar(a, b));

                break;

            case 3:
                vista.mostrarResultado(modelo.sumar(a, b));
                break;
            case 4:
                vista.mostrarResultado(modelo.sumar(a, b));
                break;
            default:
                throw new AssertionError();
        }

    }
/*
    // Esta el método que ejecuta la operación
    public void ejecutar(int a, int b) {
        // Hacemos el trabajo del controlador
        int resultado = modelo.sumar(a, b); // Llamamos al método de suma para obtener el resultado
        vista.mostrarResultado(resultado); // Mostramos el resultado con el método de la lase vista

        // vista.mostrarResultado(modelo.sumar(a, b)); // Método rápido de muestra de resultado
    }*/

}
