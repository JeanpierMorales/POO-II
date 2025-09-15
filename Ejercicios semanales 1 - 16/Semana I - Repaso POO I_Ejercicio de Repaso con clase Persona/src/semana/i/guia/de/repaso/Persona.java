package semana.i.guia.de.repaso;

public class Persona {

    // Declaración de atributos 
    private String nombre; // Nombre de la persona
    private String apellido; // Apellido de la persona
    private int edad; // Edad de la persona

    // Declaración de los constructores y metodos publicos 
    public Persona() {
    } // Constructor vacio 
    
    // Sobrecarga de mpetodos 
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    // Declaración de los métodos de acceso 
    // Get 
    public String getNombre() {
        return this.nombre; // El this se refieres a que es el uso de una variable de esta clase y devuelve el valor o estado del atributo 
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }
    //Set 

    public void setNombre(String nombre) { // Permite establecer o modificar el calor de un atributo 
        this.nombre = nombre;
    }

    public void setApellido(String apellido) { // Void significa que no revuelve nada
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mayorEdad(int edad) {
        if (edad < 18) {
            System.out.println("Usted es Menor de Edad");
        } else {
            System.out.println("Usted es Mayor de Edad");
        }
    }

}

/*private String nombre; // Nombre de la ciudad
    private int anioFundacion; // Año de fundación
    private double cantHabitantes;  // Cantidad de habitantes
    private double personasContagiadas; // Cantidad de personas infectadas con covid - 19
    private double ratiosContagio; // Ratios de contagio de la ciudad*/
