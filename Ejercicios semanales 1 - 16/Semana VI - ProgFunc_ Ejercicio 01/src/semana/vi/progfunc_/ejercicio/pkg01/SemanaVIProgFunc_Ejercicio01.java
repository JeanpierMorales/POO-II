package semana.vi.progfunc_.ejercicio.pkg01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SemanaVIProgFunc_Ejercicio01 {

    public static void main(String[] args) {
        // Filtrar una lista de numeros impares 
        Function<List<Integer>, List<Integer>> 
                filtrarImpares = lista -> lista.stream() // Convertimos la lista en un tipo de stream
                .filter(n -> n % 2 == 0) // Para todos los números que sean impares
                .collect(Collectors // Recolacta los npumeros impares obtenidos del arreglo
                        .toList()); // Lo guarda en una nueva lista
        
        // Creamos una lista para la prueba
        List <Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        // Invocamos a la función
        List <Integer> impares = filtrarImpares.apply(numeros);
        
        System.out.println("Números impares: " + impares);
 }
    

}
