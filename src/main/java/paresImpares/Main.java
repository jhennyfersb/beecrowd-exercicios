//https://www.beecrowd.com.br/judge/pt/problems/view/1259
package paresImpares;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int quantNumeros = sc.nextInt();
        while (quantNumeros > 0) {
            numeros.add(sc.nextInt());
            quantNumeros--;
        }
        numeros.sort((a, b) -> {

            // Se os dois números forem pares, número menor deve ser colocado no índice mais baixo
            if (a % 2 == 0 && b % 2 == 0)
                return (a - b);

            // Se ambos os números forem ímpares, maior número deve ser colocado no índice mais baixo
            if (a % 2 != 0 && b % 2 != 0)
                return (b - a);

            // Se a é par e b é impar, a deve ser colocado antes de b
            if (a % 2 == 0)
                return -1;

            // Se b é par e a é impar, b deve ser colocado antes de a
            return 1;
        });
        numeros.forEach(System.out::println);
    }

}



