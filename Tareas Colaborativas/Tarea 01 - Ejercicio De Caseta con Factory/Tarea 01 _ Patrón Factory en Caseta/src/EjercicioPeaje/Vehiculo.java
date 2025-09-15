package EjercicioPeaje;

public abstract class Vehiculo {
    // Definamos los métodos
   private int pagoPeaje;
   
   
   // Declaración de metodos de acceso y constructores

    public Vehiculo() {
        this.pagoPeaje = pagoPeaje;
    }


    public int getPagoPeaje() {
        return pagoPeaje;
    }

    public void setPagoPeaje(int pagoPeaje) {
        this.pagoPeaje = pagoPeaje;
    }

    
   
    
    
    // Declaración del método Pasar Peaje
    public abstract void pasarPeaje(); // Declaro la función que sera usada en cada una de las clase hijas por separado
    // Al ser abstracta esta función, los hijos obligatoriamente a modo de contrato, tendrán que implementarlos
}
