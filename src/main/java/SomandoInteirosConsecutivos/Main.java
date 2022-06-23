package SomandoInteirosConsecutivos;
//https://www.beecrowd.com.br/judge/pt/problems/view/1149
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = 0;
        int soma = 0;
        
        while (N <= 0){
            N = sc.nextInt();
        }
        for(int i = 0; i <= N - 1; i++){
            soma += A + i;
        }
        System.out.println(soma);
    }
}