import java.util.Arrays;
import java.util.List;

public class Challenge09 {

    /*Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console. */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosDistintos = numeros.stream().distinct().count() == numeros.size();

        if (numerosDistintos) {
            System.out.println("Todos os números da lista são distintos.");
        } else {

            System.out.println("Existem números repetidos na lista");


        }

    }
}
