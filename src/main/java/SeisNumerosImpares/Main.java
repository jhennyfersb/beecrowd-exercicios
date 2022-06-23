package SeisNumerosImpares;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1070
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
            while ( i < 6 ) {
                if (x % 2 == 1) {
                    i++;
                    System.out.println(x);
                }
                 x++;
            }
        }
    }