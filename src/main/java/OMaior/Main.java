package OMaior;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1013
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior  = (a+b+ Math.abs(a-b))/2;

        System.out.println(Math.max(maior, c) + " eh o maior");
    }
}
