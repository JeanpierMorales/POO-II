package ejemplo.servicios.de.resort;

public class HotelFacade {

    // Recepción del hotel 
    // Como la fachada usará los servicios, tendrá que tener los atributos de control central para simplificarle la vista al usuario
    private Cocina cocina;
    private Lavanderia lavanderia;
    private Spa spa;
    
    // Constructor 

    public HotelFacade() {
        this.cocina = new Cocina();
        this.lavanderia = new Lavanderia();
        this.spa = new Spa();
    }
    

    public void pedirComida() {
        cocina.prepararComida();
    }

    public void reservarMasaje() {
        spa.reservarMasaje();
    }

    public void lavarRopa() {
        lavanderia.lavarRopa();
    }

    public void pedirTodo() {
        lavanderia.lavarRopa();
        cocina.prepararComida();
        spa.reservarMasaje();

    }
}
