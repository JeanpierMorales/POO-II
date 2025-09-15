package semana.ii.ejercicio.figuras.geometricas;

public class Circulo extends FiguraGeometrica{

    
    @Override // Es el compromiso que tienen todas las clases que heredan de la superclase 
    public void dibujar() {
        System.out.println("Se ha generado un circulo");
    }
    
}
