package CrescenteEDecrescente;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1113
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != Y) {
            if (X > Y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
    }
}