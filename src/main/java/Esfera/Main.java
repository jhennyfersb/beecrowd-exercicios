package Esfera;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1011
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double volume = (4 / 3.0) * 3.14159 * (raio * raio * raio);
        System.out.format("VOLUME = %.3f\n", volume);
    }
}