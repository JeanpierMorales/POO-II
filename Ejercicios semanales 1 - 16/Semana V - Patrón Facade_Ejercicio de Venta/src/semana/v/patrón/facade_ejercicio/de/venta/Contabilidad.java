package semana.v.patrón.facade_ejercicio.de.venta;

public class Contabilidad {
    
    public void registrarTransaccion(String producto, float monto){
        System.out.println("Transaccion registrada: " + producto + " S/. " + monto);
    }
}
