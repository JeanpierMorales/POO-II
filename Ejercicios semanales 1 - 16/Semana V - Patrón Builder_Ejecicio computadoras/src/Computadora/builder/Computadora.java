/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Computadora.builder;

/**
 *
 * @author Omar Morales Silva
 */
public class Computadora {

    // Declaramos los atributos básicos de la computadora (Marca y modelo), y adicionalmente las demás serán para los otros tipos de computadoras más especializadas
    private String marca;
    private String modelo;
    private String procesador;
    private String tarjetaGrafica;
    private String sistemaOperativo;
    private String tipoAlmacenamiento;
    private int memoriaRAM;
    private int almacenamiento;
    private boolean tienenBluetooth;
    private boolean tienenWebCam;
    private boolean tienenWifi;

    // Solo puede ser invocado desde la clase bomputadora Builder
    // Este método fuerza a que todos los objetos se construyan de manera contorlada
    private Computadora(ComputadoraBuilder builder) {
        this.marca = builder.getMarca();
        this.modelo = builder.getModelo();
        this.procesador = builder.getProcesador();
        this.tarjetaGrafica = builder.getTarjetaGrafica();
        this.sistemaOperativo = builder.getSistemaOperativo();
        this.tipoAlmacenamiento = builder.getTipoAlmacenamiento();
        this.memoriaRAM = builder.getMemoriaRAM();
        this.almacenamiento = builder.getAlmacenamiento();
        this.tienenBluetooth = builder.isTienenBluetooth();
        this.tienenWebCam = builder.isTienenWebCam();
        this.tienenWifi = builder.isTienenWifi();
    }
    
    // Método auxiliar para mostrar los datos del objeto instanciado
    public void mostrarDatos(){
        
        // System.out.println("Marca: " + (marca!=null ? marca : "No especificado")); Ejemplo poco eficiente de impresión

        
        // Condicionamos la impresión de los atributos a que sean diferentes de null para poder apreciarse 
        if(marca!=null) System.out.println("Marca: " + marca);
        if(modelo!=null) System.out.println("Modelo: " + modelo);
        if(procesador!=null) System.out.println("Procesador: " + procesador);
        if(tarjetaGrafica!=null) System.out.println("Tarjeta gráfica: " + tarjetaGrafica);
        if(sistemaOperativo!=null) System.out.println("Sistema Operativo: " + sistemaOperativo);
        if(tipoAlmacenamiento!=null) System.out.println("Tipo de Almacenamiento: " + tipoAlmacenamiento);
        if(memoriaRAM!=0) System.out.println("Memotia Ram: " + memoriaRAM);
        if(almacenamiento!=0) System.out.println("Almacenamiento: " + almacenamiento);
        if(tienenBluetooth) System.out.println("Tiene Bloetooth: Sí" );
        if(tienenWebCam) System.out.println("Tiene WebCam: Sí" );
        if(tienenWifi) System.out.println("Tiene Wifi: Sí");
    }

    // Método estatico para crear un objeto de la clase computadora desde Computadora Builder
    public static Computadora crearDesdeBuilder(ComputadoraBuilder builder){ // Solo se instancia una sola vez "static"
        return new Computadora(builder);
    }
}
