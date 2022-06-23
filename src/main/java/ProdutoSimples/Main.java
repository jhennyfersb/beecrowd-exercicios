package ProdutoSimples;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1004
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int PROD = A * B;
        System.out.println("PROD = " + PROD);
    }
}
