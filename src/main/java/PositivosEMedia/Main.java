package PositivosEMedia;
//https://www.beecrowd.com.br/judge/pt/problems/view/1064
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            double numero = sc.nextDouble();
            if( numero > 0){
                c++;
                soma = soma + numero;
            }
        }
        System.out.println(c + " valores positivos");
        System.out.format("%.1f\n",soma / c );
    }
}