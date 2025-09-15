package semana.ii.ejercicio.penales;

import java.util.Scanner;

public class Jugador {

    private int dorsal;
    private String posicion;
    private String equipo;

    public Jugador(int dorsal, String posicion, String equipo) {
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return this.equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int patearPenal() {

        // El jugador patea a 9 diferentes posibles puntos de tiro al arco
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la posicion del tiro: ");
        int auxTiro = teclado.nextInt(); // podría revolver esto y acelerar el proceso 

        return auxTiro;
    }

}
