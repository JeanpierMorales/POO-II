
package EjercicioPeaje;

public class Pesado extends Vehiculo{
    
    public Pesado(){
        this.setPagoPeaje(50);
    }
    
    // Sobreescribimor la función abstracta para moldearla de acuerdo al vehículo Pesado
     @Override
    public void pasarPeaje() {
        System.out.println("Ha pasado un vehiculo Pesado ");
    }
    
    
}
