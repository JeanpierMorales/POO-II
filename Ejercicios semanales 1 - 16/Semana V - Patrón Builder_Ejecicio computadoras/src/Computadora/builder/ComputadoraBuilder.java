/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Computadora.builder;

/**
 *
 * @author Omar Morales Silva
 */
public class ComputadoraBuilder {
    // Los atributos de la clase builder son los mismos de la clase base 
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
    
    // Creamos los métodos de acceso, primero los setter, y luego los getter

    public ComputadoraBuilder setMarca(String marca) { //Setteamos que devuelva cada objeto con diferentes caracteristicas
        this.marca = marca;
        return this;
    }

    public ComputadoraBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ComputadoraBuilder setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
        
    }

    public ComputadoraBuilder setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    public ComputadoraBuilder setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        return this;
    }

    public ComputadoraBuilder setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        return this;
    }

    public ComputadoraBuilder setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    public ComputadoraBuilder setTienenBluetooth(boolean tienenBluetooth) {
        this.tienenBluetooth = tienenBluetooth;
        return this;
    }

    public ComputadoraBuilder setTienenWebCam(boolean tienenWebCam) {
        this.tienenWebCam = tienenWebCam;
        return this;
    }

    public ComputadoraBuilder setTienenWifi(boolean tienenWifi) {
        this.tienenWifi = tienenWifi;
        return this;
    }

    
    

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public String getTarjetaGrafica() {
        return this.tarjetaGrafica;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public String getTipoAlmacenamiento() {
        return this.tipoAlmacenamiento;
    }

    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public int getAlmacenamiento() {
        return this.almacenamiento;
    }

    public boolean isTienenBluetooth() {
        return this.tienenBluetooth;
    }

    public boolean isTienenWebCam() {
        return this.tienenWebCam;
    }

    public boolean isTienenWifi() {
        return this.tienenWifi;
    }
    
    // Creamos el método de generación de objetos
    public Computadora build(){
        return Computadora.crearDesdeBuilder(this);
    }
    
    
}
