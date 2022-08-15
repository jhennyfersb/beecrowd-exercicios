//https://www.beecrowd.com.br/judge/pt/problems/view/1244
package OrdenaçãoPorTamanho;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosTeste = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < casosTeste; j++) {
            List<String> frases = new ArrayList<>();
            frases.add(sc.nextLine());
            for (String frase : frases) {
                String[] strings = frase.split(" ");
                Arrays.sort(strings, (a, b) -> b.length() - a.length());
                String s = String.join(" ", strings);
                System.out.println(s);
            }
        }
    }
}

