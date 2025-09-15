package EjercicioPeaje;

public class VehiculoFactory {

    // creamos una función que devuelva instancias de tipo Vehiculo 
    public Vehiculo generarVehiculo(String tipoVehiculo) { // Vamos a recibir como parametro una cadena que nos indicará qué tipo de vehículo vamos a generar
        
        if (tipoVehiculo == null) { // Si no recibe nada, no genera nada
            return null;
        }
        
        // Evaluemos los casos de input del parametro tipoVehículo
        if (tipoVehiculo.equalsIgnoreCase("moto")) {
            return new Moto(); // Si lo ingresado es la palabra moto, Se genera una instancia de moto que hereda de vehículo
        } else if (tipoVehiculo.equalsIgnoreCase("liviano")) {
            return new Liviano();// Si lo que entra es la palabra liviano, genera una instancia de vehículo liviano
        } else if (tipoVehiculo.equalsIgnoreCase("mediano")) {
            return new Mediano(); // Si lo que entra es la palabra mediano, genera una instancia de la clase mediano que hereda de vehículo
        } else if (tipoVehiculo.equalsIgnoreCase("pesado")) { 
            return new Pesado(); // Si se ingresa la palabra Pesado, devuelve una instancia de la clase pesado que hereda de vehiculo 
        }
        
        return null; // Caso alterno, no revuelve nada */
    }

}
