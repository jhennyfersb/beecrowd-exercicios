package Fliper;
//https://www.beecrowd.com.br/judge/pt/problems/view/2454
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();

        if (p == 1 && r == 1) {
            System.out.println("A");
        } else if (p == 1 && r == 0) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
