package semana.ii.ejercicio.mario.enemys;

public class EnemigoFactory {
    public Enemigo generarEnemigo(int codEnemigo){
        
        // El metodo generar enemigo devuelve un objeto de la clase enmigo
        // Rebibe como paramtetro un codigo enemigo 
        switch (codEnemigo) {
            case 1:
                return new Goomba();
            case 2:
                return new BulletBill();
            case 3:
                return new Koopa();
        }return null;
        
    }
}
