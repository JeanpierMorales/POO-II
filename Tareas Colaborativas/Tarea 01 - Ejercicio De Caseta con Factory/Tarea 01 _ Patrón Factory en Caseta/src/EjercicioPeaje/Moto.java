package EjercicioPeaje;

public class Moto extends Vehiculo {

    public Moto() {
        this.setPagoPeaje(0);
    }
    
    
    

    @Override
    // La sobreescritura del método pasar Peaje con las caracteristicas de una moto
    public void pasarPeaje() {
        System.out.println("Ha pasado una Moto ");
    }

}
