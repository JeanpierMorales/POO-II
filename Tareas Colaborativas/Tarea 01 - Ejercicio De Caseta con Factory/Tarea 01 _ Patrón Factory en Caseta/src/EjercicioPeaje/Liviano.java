package EjercicioPeaje;

public class Liviano extends Vehiculo {

    public Liviano() {
        this.setPagoPeaje(20);
    }
    
    

    @Override
    public void pasarPeaje() {
        System.out.println("Ha pasado una vehiculo Liviano ");
    }

}
