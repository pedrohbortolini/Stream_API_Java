import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge03 {

    /*Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console. */

public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

List<Integer> numerosNaoPositivos = numeros.stream()
                                                    .filter(n -> n <= 0)
                                                    .collect(Collectors.toList());
        if (!numerosNaoPositivos.isEmpty()) {
            System.out.println("Os seguintes números da lista são negativos: " + numerosNaoPositivos);
        } else {
            System.out.println("Todos os números são positivos (maiores que zero).");
        }
}

}
