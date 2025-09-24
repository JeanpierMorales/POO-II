package semana.vi.progfunc_ejercicio03;

import java.util.function.Function;

public class SemanaVIProgFunc_Ejercicio03 {

    public static void main(String[] args) {
        // Funciona lambda para contar las letras en un cadena de texto
        
        Function<String, Integer> contarLetras = s->(int)s.chars().filter(Character::isDigit).count();
        
        String cadena = "Hola mundo45";
        int cantidad = contarLetras.apply(cadena);
        System.out.println("Número de caracteres: " + cantidad);
    }
    
}
