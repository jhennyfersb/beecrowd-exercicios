package Media1;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1005
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double media = (A * 3.5 + B * 7.5) / 11.0;
        System.out.format("MEDIA = %.5f\n" , media);
    }
}