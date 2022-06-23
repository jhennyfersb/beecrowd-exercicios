package AreaDoCirculo;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1002
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double raio = sc.nextDouble();
    double pi = 3.14159;
    double area = pi * (raio * raio);
    System.out.format("A=%.4f\n" , area);


    }

}