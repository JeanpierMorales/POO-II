package semana.v.patrón.facade_ejercicio.de.venta;

public class SemanaVPatrónFacade_EjercicioDeVenta {

    public static void main(String[] args) {

        SistemaDeGestion venta = new SistemaDeGestion();
        venta.vender("Laptop", 1200, 1, "Mken");
    }
}
