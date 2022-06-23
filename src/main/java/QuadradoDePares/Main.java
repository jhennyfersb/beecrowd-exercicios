package QuadradoDePares;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1073
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int resultado = 0;

        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                resultado = i * i;
                System.out.println(i + "^2 = " + resultado);
            }
        }
    }
}