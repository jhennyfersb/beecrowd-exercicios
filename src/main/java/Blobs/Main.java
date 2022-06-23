package Blobs;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1170
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int casos = 0;
        int dia = 0;

        while (casos < n) {
           double comida = sc.nextDouble();
             dia = 0;
            while (comida > 1) {
                comida = comida / 2;
                dia++;
            }
            System.out.println(dia + " dias");
            casos++;
        }
    }
}
