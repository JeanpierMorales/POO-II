package semana.vi.patrón.adapter_ejerciciousb;

public class SemanaVIPatrónAdapter_EjercicioUSB {

    public static void main(String[] args) {
        // Instanciamos el adaptador que será el que mostrará la conexión 
        // Cliente conectando a un lector SD a un puerto USB a través del adaptador
        USB dispositivo = new AdaptadorSDaUSB(new LectorTarjetasSD());
        dispositivo.conectarConUsb(); // Se traduce la conexión de SD a USB
    }

}
