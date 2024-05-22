import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge18 {

    /*Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console. */

public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosNaoRepetidos = numeros.stream().distinct().collect(Collectors.toList());

    if(numerosNaoRepetidos.size() == 1) {
        System.out.println("Todos os números da lista são iguais: " + numeros);


    } else{
        System.out.println("Os números da lista não são todos iguais: " + numeros);
    }

}
}
