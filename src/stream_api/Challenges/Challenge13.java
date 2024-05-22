import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge13 {

    /*Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico 
(por exemplo, entre 5 e 10) e exiba o resultado no console. */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int limiteInferior=5;
        int limiteSuperior=10;
        
    List<Integer> numerosNoIntervalo = numeros.stream()
                                            .filter( n -> n > limiteInferior && n <= limiteSuperior)
                                            .collect(Collectors.toList());

    System.out.println("Os números no intervalo entre "+ limiteInferior + " e " + limiteSuperior + " são: " + numerosNoIntervalo);

    }
}
