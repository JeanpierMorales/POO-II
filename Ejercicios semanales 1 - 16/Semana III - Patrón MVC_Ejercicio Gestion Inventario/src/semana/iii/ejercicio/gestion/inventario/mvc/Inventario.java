package semana.iii.ejercicio.gestion.inventario.mvc;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    // La clase Producto es una relación de agregación ya que esta contenida dentro del inventario
    private List<Producto> productos = new ArrayList<>(); // Declaración de una lista de Arrays

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto p) {
        // Agregar objeto P de la clase producto a la Lista Producto
        // Add a este tributo de producto
        this.productos.add(p);

    }

    public void eliminarProducto(String nombreProducto) {
        // Objeto, método , condicion 
        // Se eliminará solo si el nombre del objeto es igual al nombre que se ha ingresado
        productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombreProducto)); // Uso de función lambda

    }

}
