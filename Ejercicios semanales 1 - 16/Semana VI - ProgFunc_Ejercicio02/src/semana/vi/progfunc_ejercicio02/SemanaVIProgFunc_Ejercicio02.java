package semana.vi.progfunc_ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class SemanaVIProgFunc_Ejercicio02 {

 
    public static void main(String[] args) {
        // Crear una lista de objetos de la clase Producto, cuyo precio sea mayor a s/50
        List<Producto> listaProductos = new ArrayList<Producto>();
        
        listaProductos.add(new Producto("Producto 1", 13.0));
        listaProductos.add(new Producto("Producto 2", 23.0));
        listaProductos.add(new Producto("Producto 3", 45.0));
        listaProductos.add(new Producto("Producto 4", 20.0));
        listaProductos.add(new Producto("Producto 5", 50.0));
        listaProductos.add(new Producto("Producto 6", 52.0));
        listaProductos.add(new Producto("Producto 8", 42.0));
        listaProductos.add(new Producto("Producto 9", 34.0));
        listaProductos.add(new Producto("Producto 10", 27.0));
        listaProductos.add(new Producto("Producto 11", 12.0));
        listaProductos.add(new Producto("Producto 12", 44.0));
        
        listaProductos.stream()
                .filter(producto -> producto
                        .getPrecioProducto()>30.0)
                .map(Producto::toString) // Llama a los métodos de la clase instanciada
                .forEach(System.out::println);
        
        
    }
    
}
