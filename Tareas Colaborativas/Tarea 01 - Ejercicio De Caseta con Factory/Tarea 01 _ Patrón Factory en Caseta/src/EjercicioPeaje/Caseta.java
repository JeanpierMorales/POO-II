package EjercicioPeaje;

import java.util.Random;

public class Caseta {

    public void cobrarPeaje() { // Va a devolver un entero que será el monto recaudado por el pase de los vehiculos 

        // Creamos una instancia de la clase Random para la aleatoriedas de los vehiculos
        Random random = new Random();

        // Instanciamos la fabrica de vehiculos para poder acceder a la creación de los vehiculos 
        VehiculoFactory factory = new VehiculoFactory();

        // Definimos la cadena con los nombre de cada tipo de vehiculo que pasarán por la caseta
        String[] tipoVehiculo = {"Moto", "Liviano", "Mediano", "Pesado"};

        // Inicializamos la variable del monto total que retornará al final de la función
        // Adicionamos un contador para cada tipo de vehiculo para tener un mejor control de reportes
        int montoTotal = 0, motos = 0, liviano = 0, mediano = 0, pesado = 0;

        System.out.println("##################### BIENVENIDO 'AL PEAJE EL MIRADOR' ##################################");

        // Vamos a simular el paso de los 100 vehiculos con el uso de la estructura for y un contador 
        for (int i = 0; i < 100; i++) { // Decimos que el contador va a ir de 0 a 100

            System.out.println(" --------------------------------------  "); // IMprimimmos una linea para simular el pasé 

            // Inicializamos una variable para que obtenga una valor random entre 0 a 3 que son ls indices del array TipoVehiculo 
            int indice = random.nextInt(tipoVehiculo.length); // Obtengo la longitud del array de String

            // Tenenmos que crear una instancia de vehiculo y luego acceder a traves del metodo que esta en la fabrica
            // El vehículo va a ser igual a tipo de vehiculo que va a agenerar la fabrica a traves de lo que encuentre de acuerdo al índice del array
            Vehiculo vehiculo = factory.generarVehiculo(tipoVehiculo[indice]);

            // Entonces procedemos a cobrar los montos de acuerdo al tipo de vehiculo que ha pasado
            
            // Realizamos el uso de un Rule Switch para mejor eficiencia, legibilidad y para trabajar con lo índices de forma independiente
            switch (indice) { // Con el indice seremos capaz ce usar esta estructura para poder facilitar la salida de casos. 
                case 0 -> {
                    montoTotal = montoTotal + vehiculo.getPagoPeaje(); // Para caso 1 (Moto) se va a cobrar 0 soles
                    motos = motos + 1;
                }
                case 1 -> {
                    montoTotal = montoTotal + vehiculo.getPagoPeaje(); // Para caso 2 (Liviano), se cobrará 20 soles
                    liviano = liviano + 1;
                }
                case 2 -> {
                    montoTotal = montoTotal + vehiculo.getPagoPeaje(); // Para el caso 3 (Mediano), se contrará 30 soles 
                    mediano = mediano + 1;
                }
                case 3 -> {
                    montoTotal = montoTotal + vehiculo.getPagoPeaje(); // Para caso 4 (Pesado), se cobrarán 50 soles
                    pesado = pesado + 1;
                }
                default -> {
                }

            }
            // Con el indice seremos capaz ce usar esta estructura para poder facilitar la salida de casos.
            vehiculo.pasarPeaje(); // Realiza la impresión de que ha pasado un vehículo de tipo tipoVehiculo[indice]

        }
        mostrarPeaje(montoTotal, motos, liviano, mediano, pesado); // Llamamos a la función para que pueda realiza la impresión del speaje 
    }

    // Vamos a definir el resumen de los vehículos que han pasado y adiconalmente daremos algunos aportes extra que pueden servirnos 
    public void mostrarPeaje(int montoTotal, int moto, int liviano, int mediano, int pesado) { // Recibe como argumento el monto total de tipo entero 
        System.out.println("************************* REPORTE DE MONTO RECAUDADO ************************************");
        System.out.println(" RESUMEN ");
        System.out.println(" * Cant. Motos:" + moto); // Muestra la cantidad de motos que han pasado 
        System.out.println(" * Cant. Livianos: " + liviano); // Muestra la cantidad de vehiculos livianos que han pasado
        System.out.println(" * Cant. Medianos: " + mediano); // Muestra la cantidad de vehiculos medianos que han pasado
        System.out.println(" * Cant. Pesados: " + pesado); // Muestra la cantidad de vehiculos pesado que han pasado
        System.out.println(" * Cant. Total de V. : " + (pesado + mediano + liviano + moto)); // Muestra la cantidad de vehiculos pesado que han pasado
        System.out.println(" * El monto total recaudado por la caseta es de : " + montoTotal + " Soles"); // Muestra en pantalla cuánto es el monto total que se ha recudado
        System.out.println("************************* FIN DEL REPORTE DEL PEAJE *************************************");

    }

}
