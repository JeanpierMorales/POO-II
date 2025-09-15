package EjercicioPeaje;

public class Mediano extends Vehiculo {

    public Mediano() {
        this.setPagoPeaje(30);
    }

    
    
    @Override
    public void pasarPeaje() {
        System.out.println("Ha pasado una vehiculo Mediano ");
    }

}
