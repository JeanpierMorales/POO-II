package semana.v.patrón.facade_ejercicio.de.venta;

public class RecursosHumanos {
    public void asignarComision(String empleado, float monto){
        float comision = (float) (monto * 0.10);
        System.out.println("Comision para " + empleado + ":  S/. " + comision );
    }
}
