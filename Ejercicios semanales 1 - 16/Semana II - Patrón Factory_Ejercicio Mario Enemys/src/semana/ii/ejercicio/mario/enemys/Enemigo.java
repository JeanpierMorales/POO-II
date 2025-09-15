package semana.ii.ejercicio.mario.enemys;

public class Enemigo {
    // DEclaración de los atributos de la clase

    private int codEnemigo;
    private String nombreEnemigo;
    private int fuerzaEnemigo;

    // declaración de los métodos constructores
    // Declaración de los métodos de Accedo
    public int getCodEnemigo() {
        return this.codEnemigo;
    }

    public void setCodEnemigo(int codEnemigo) {
        this.codEnemigo = codEnemigo;
    }

    public String getNombreEnemigo() {
        return this.nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
    }

    public int getFuerzaEnemigo() {
        return this.fuerzaEnemigo;
    }

    public void setFuerzaEnemigo(int fuerzaEnemigo) {
        this.fuerzaEnemigo = fuerzaEnemigo;
    }

    // Métodos auxiliares para la impresión de datos 
    public void mostrarEnemigo() {
        System.out.println("Se ha generado un enemigo de tipo : " + this.nombreEnemigo);
        System.out.println("EL neemigo tiene una fuerza de: " + this.fuerzaEnemigo);
    }
}
