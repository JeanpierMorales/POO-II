package semana.iii.ejercicio.gestion.inventario.mvc;

public class Producto {
    
    // Atributos del producto 
    private String nombre;
    private float precio;

    // Constructores 
    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Metodos de accedo 

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    // Métodos auxiliares 
    
}
