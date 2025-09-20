package ejemplo.servicios.de.resort;

public class ResortEjemplo {

    public static void main(String[] args) {
        
        // Instanciamos la recepción a modo de fachada
        HotelFacade fachada = new HotelFacade();
        
        // El cliente pide el servicio
        
        fachada.pedirComida();
        fachada.reservarMasaje();
        
        System.out.println("******************************");
        
        fachada.pedirTodo();
    }

}
