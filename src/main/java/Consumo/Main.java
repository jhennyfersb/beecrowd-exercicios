package Consumo;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1014
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanciaTotal = sc.nextInt();
        double consumo = sc.nextDouble();
        double consumoMedio = distanciaTotal/consumo;

        System.out.format("%.3f km/l\n",consumoMedio );

    }
}