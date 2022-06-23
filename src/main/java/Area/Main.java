package Area;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1012
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.format("TRIANGULO: %.3f\n", a * (c/2));
        System.out.format("CIRCULO: %.3f\n",3.14159 * (Math.pow(c,2)));
        System.out.format("TRAPEZIO: %.3f\n",((a + b )* c )/2);
        System.out.format("QUADRADO: %.3f\n", b * b);
        System.out.format("RETANGULO: %.3f\n", a * b);
        
    }
}