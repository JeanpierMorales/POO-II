package semana.iii.ejercicio.mvc.ejemplo;

import java.util.Scanner;

public class Vista {

    // La vista solo muestra la información a los usuarios 
    // EN este caso mostraremos el resultado de una operación matemática
    public void menuOperaciones() {
        Scanner teclado = new Scanner(System.in);
        int opcionOperacion, a, b;
        System.out.println("############################# CALCULADORA ###############################");

        System.out.print("Ingresa tu primer número: ");
        a = teclado.nextInt();
        System.out.print("Ingresa tu segundo número: ");
        b = teclado.nextInt();

        System.out.println("*******************************");

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número de la operación de preferencia: ");
        opcionOperacion = teclado.nextInt();
    }

    public void mostrarResultado(int a) {
        System.out.println("El resultado de la operación es: " + a);
    }

}
