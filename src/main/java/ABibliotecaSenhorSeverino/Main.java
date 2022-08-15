//https://www.beecrowd.com.br/judge/pt/problems/view/2137
package ABibliotecaSenhorSeverino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLivros = 0;
        while (sc.hasNext()) {
            List<String> livros = new ArrayList<>();
            numeroLivros = sc.nextInt();
            for (int i = 0; i < numeroLivros; i++) {
                livros.add(sc.next());
            }
            Collections.sort(livros);
            livros.forEach(System.out::println);
        }
    }
}

