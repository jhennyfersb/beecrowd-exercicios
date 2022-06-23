package Diferenca;

import java.io.IOException;
//https://www.beecrowd.com.br/judge/pt/problems/view/1007
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca); 
       
    }
 
}