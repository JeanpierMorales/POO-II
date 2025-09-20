package semana.v.patrón.facade_ejercicio.de.venta;

public class SistemaDeGestion {

    private Contabilidad contabilidad; 
    private Inventario inventario; 
    private RecursosHumanos rrhh;
    
    public SistemaDeGestion() {
        this.contabilidad = new Contabilidad();
        this.inventario = new Inventario();
        this.rrhh = new RecursosHumanos();
    }
    
    public void vender(String producto, float monto, int cantidad, String empleado ){
        contabilidad.registrarTransaccion(producto, monto);
        inventario.actualizarInventario(producto, cantidad);
        rrhh.asignarComision(empleado, monto);
    }
}
