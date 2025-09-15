package semana.i.ejercicio.persona;

import java.util.Scanner;

public class Persona {

    // Encapsulamiento de las variables
    private String nombre;
    private String apellido;
    private int edad;

    // Declaración de los métodos Constructores
    public Persona(String nombre, String apellido, int edad) { // Los argumentos alimentaran a los atributos de la clase 
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() { // Es mala práctica dejar el constructor vacio, asi que mejor lo llenamos para que 
        this.nombre = "";
        this.apellido = "";
        this.edad = -1;
        
    }

    // Declaración de los métodos de 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo auxiliar para solicitar la data
    public void pedirData() {
        // Programa que obtendrá valores por teclado y realiza la impresión

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite el nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("Digite el apellido: ");
        this.apellido = teclado.nextLine();
        System.out.print("Digite la edad: ");
        this.edad = teclado.nextInt();

        // Tenemos los datos capturados en las variables
    }

    // Método de impresión de la data
    public void mostrarDatos() { // Esto es un método auxiliar 
        System.out.println("--------------Datos de la persona ingresada----------------------------------------");
        System.out.println("Nombre: " + this.nombre); // Usamos el This para que haga referencia a esta clase 
        System.out.println("Apellido: " + this.apellido); // EL this hará más legible el codigo
        System.out.println("Edad: " + this.edad + " años ");
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
