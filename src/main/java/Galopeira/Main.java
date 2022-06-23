package Galopeira;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2147
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        double cont = 0.00;
        for (int i = 0; i < casos; i++) {
            cont = 0.00;
            String palavra = sc.next();
            for (int j = 0; j < palavra.length(); j++) {
                cont = cont + 0.01;
            }
            System.out.format("%.2f\n", cont);
        }
    }
}