package semana.i.guia.de.repaso;

import java.util.Scanner;

public class SemanaIGuiaDeRepaso {

    public static void main(String[] args) { // La clase principal es lo primero que se ejecuta al correr el sistema 
        
        // Instanciamos la clase scanner para recoger la información
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables 
        String nombre, apellido;
        int edad;

        // Insersión de la data teclado 
        System.out.print("Digite el nombre: ");
        nombre = teclado.nextLine(); // El nextLine captura lo escrito para las variables de tipo String
        System.out.print("Digite el apellido: ");
        apellido = teclado.nextLine();
        System.out.print("Digite la edad: ");
        edad = teclado.nextInt(); // El tipo de next que usaremos depende del tipo de data que necesitamos

        // Creación de la clase Persona un objeto persona 
        // 
        Persona persona = new Persona();

        // Insertar la data de la persona con el uso de los setters
        // El paradigma orientado a objetos se compone de la formula: Objeto + Método de Acceso + Parametro
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEdad(edad);

        System.out.println("--------------Datos de la persona ingresada----------------------------------------");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad() + " años ");
        persona.mayorEdad(persona.getEdad());
        System.out.println("-----------------------------------------------------------------------------------");
    }

}
