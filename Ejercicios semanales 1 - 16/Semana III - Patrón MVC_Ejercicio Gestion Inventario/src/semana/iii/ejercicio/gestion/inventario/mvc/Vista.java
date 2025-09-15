package semana.iii.ejercicio.gestion.inventario.mvc;

import java.util.List;

public class Vista {

    public void mostrarProductos(List<Producto> productos) {
        System.out.println("############################## REPORTE DE INVENTARIO ######################");
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario");
        } else {
            for (Producto p : productos) {
                System.out.print(" - " + p.getNombre());
                System.out.println("| S/. " + p.getPrecio() + " Soles");
                        
            }
        }

    }

}
