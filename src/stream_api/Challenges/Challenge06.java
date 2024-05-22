import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge06 {

    /*Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console. */

public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);

    List<Integer> numerosMaioresQueDez = numeros.stream().filter(n-> n >10).collect(Collectors.toList());

    if (!numerosMaioresQueDez.isEmpty()) {
        System.out.println("Esses são os números maiores que 10: " + numerosMaioresQueDez);
    }else{
        System.out.println("A lista não possui números maiores que 10.");
}
}
}