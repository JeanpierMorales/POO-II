package semana.ii.ejercicio.figuras.geometricas;

public class FiguraGeometricaFactory {

    public FiguraGeometrica generaFigura(String tipoFigura) {
        
        if(tipoFigura == null){ //Esa comparación es solo para comparar cadenas
            return null;
        }  
        if(tipoFigura.equalsIgnoreCase("circulo")){
            return new Circulo();
        }else if(tipoFigura.equalsIgnoreCase("cuadrado")){
            return new Cuadrado();
        }else if(tipoFigura.equalsIgnoreCase("triangulo")){
            return new Triangulo();
        }
        
        return null; // Por si el valor ingresado no es valido
    }
    
    
}
