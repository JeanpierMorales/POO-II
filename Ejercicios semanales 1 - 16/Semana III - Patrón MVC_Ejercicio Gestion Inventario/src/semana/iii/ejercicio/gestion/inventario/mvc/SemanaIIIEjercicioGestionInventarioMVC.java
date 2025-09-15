package semana.iii.ejercicio.gestion.inventario.mvc;

public class SemanaIIIEjercicioGestionInventarioMVC {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, inventario);
        
        controlador.agregarProducto("Libro", 12);
        controlador.agregarProducto("Laptop", 1120);
        controlador.agregarProducto("Moviles", 500);
        controlador.agregarProducto("Cargadores", 120);
        
        controlador.mostrarProducto();
        
        controlador.eliminarProducto("moviles");
        controlador.mostrarProducto();
        
    }

}
