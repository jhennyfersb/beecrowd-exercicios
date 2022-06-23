package SubstituicaoEmVetorI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1172
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        List<Integer> V = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            int X = sc.nextInt();
            if (X <= 0) {
                V.add(1);
                resultado = 1;
                System.out.println("X[" + i + "] = " + resultado);
            } else {
                V.add(X);
                resultado = X;
                System.out.println("X[" + i + "] = " + X);
            }

        }
    }
}