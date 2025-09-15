package semana.ii.ejercicio.figuras.geometricas;

import java.util.Random;

public class SemanaIIEjercicioFigurasGeometricas {

    public static void main(String[] args) {
        FiguraGeometricaFactory fabricaFiguras = new FiguraGeometricaFactory();
        Random random = new Random();
        String[] tiposFiguras = {"Circulo", "Cuadrado", "Triangulo"};
        for (int i = 0; i < 5; i++) {
            int indice = random.nextInt(tiposFiguras.length);
            FiguraGeometrica figura = fabricaFiguras.generaFigura(tiposFiguras[indice]);
            figura.dibujar();
        }
    }

}
