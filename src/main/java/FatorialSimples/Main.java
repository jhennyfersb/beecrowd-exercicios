package FatorialSimples;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1153
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i ;

        }
        System.out.println(fatorial);
    }
}