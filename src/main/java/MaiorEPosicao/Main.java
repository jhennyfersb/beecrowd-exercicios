package MaiorEPosicao;
//https://www.beecrowd.com.br/judge/pt/problems/view/1080
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++){
            int N = sc.nextInt();
            if( N > numero){
                numero = N;
                posicao = i;
            }
        }
        System.out.println(numero);
        System.out.println(posicao);
    }
}