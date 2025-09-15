package semana.ii.ejercicio.mario.enemys;

public class SemanaIIEjercicioMarioEnemys {

    public static void main(String[] args) {
        EnemigoFactory fabricaEnemigos = new EnemigoFactory();
        fabricaEnemigos.generarEnemigo(2).mostrarEnemigo();
        
        // Modo alterno de instancias un enemigo
        Enemigo enemigo = fabricaEnemigos.generarEnemigo(1);
        enemigo.mostrarEnemigo();
    }

}
