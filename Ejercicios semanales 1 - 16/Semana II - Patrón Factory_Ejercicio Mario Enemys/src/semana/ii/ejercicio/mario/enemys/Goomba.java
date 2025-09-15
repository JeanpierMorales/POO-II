package semana.ii.ejercicio.mario.enemys;

public class Goomba extends Enemigo { // Goomba es una clase hija de enmigo

    public Goomba() {
        // Creamos un constructor con las caracteristicas propias de la clase hija
        this.setCodEnemigo(1);
        this.setNombreEnemigo("Goomba");
        this.setFuerzaEnemigo(5);
    }

}
