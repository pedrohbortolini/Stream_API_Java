import java.util.Arrays;
import java.util.List;

public class Challenge05 {

    /*Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console. */

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double mediaNumerosPares = numeros.stream().filter(n->n>5).mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println("A média dos números maiores que 5 é: " + mediaNumerosPares);
        



        
    }

}
