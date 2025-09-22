package semana.vi.patrón.adapter_ejerciciousb;

// Clase Adaptador que comunicará al SD con la entrada USB
public class AdaptadorSDaUSB implements USB {

    // referencia al objeto incompatible
    private LectorTarjetasSD lector;

    public AdaptadorSDaUSB(LectorTarjetasSD lector) { // Constructor con parametro del objeto incompatible
        this.lector = lector;
    }

    // Implementa la interfaz de target del USB
    @Override
    public void conectarConUsb() {
        // El cliente logra conectar por USB
        // Realmente es el adaptador que lo hace utulizando método ConectaroSD del su atributo lector
        System.out.println("Adaptador: Conviertiendo SD a USB");
        lector.conectarConSD();
    }

}
