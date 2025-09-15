package semana.iii.ejercicio.gestion.inventario.mvc;

public class Controlador {
    
    // Instancio la vista 
    private Vista vista;
    
    // Instancio la clase inventario por que tiene agregado a la clase producto 
    private Inventario inventario;

    public Controlador(Vista vista, Inventario inventario) {
        this.vista = vista;
        this.inventario = inventario;
    }

    // Metodos de agregación, eliminación y muestra de productos 
    public void agregarProducto(String nombre, float precio){ // Método propio del controlador
        inventario.agregarProducto(new Producto(nombre, precio));  // Petodo del inventario
    }
    public void eliminarProducto(String nombre){ // Método propio del controlador
        inventario.eliminarProducto(nombre);  // Petodo del inventario
    }
    
    public void mostrarProducto(){
        vista.mostrarProductos(inventario.getProductos());
    }
    
    // Agregar producto 
    

    
    
    
    
    
}
