package semana.i;
// Importación del la librería Math
import java.lang.Math;

public class Circulo { // Nombre de la clase a desarrollar 
    
    private double radio = 12.5; // Radio del circulo 
    private String color = "Azul"; // Color del Circulo 

    public Circulo() { // COnstructor sin parametros
    }
    
    public Circulo(double radio, String color) { // Constructor con parametros para la instrocucción de datos
        this.radio = radio;
        this.color = color;
    }

    // Metodos get y set para obtener y settear la data del radio y el color del circulo 
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Mostrar el área del circulo
    public double area(){ // Declaro el método de obtención del área
        return this.radio*this.radio*Math.PI;
    }
    
    public double area(double radio){ // Declaro el método de obtención del área con sobrecarga de argumentos 
        return radio*radio*Math.PI;
    }
    
    // Uso del método to - String

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }

    
    
}
