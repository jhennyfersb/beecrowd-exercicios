package CalculoSimples;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1010
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        System.out.format("VALOR A PAGAR: R$ %.2f\n",(quantidade1*preco1+quantidade2*preco2));
    }
}