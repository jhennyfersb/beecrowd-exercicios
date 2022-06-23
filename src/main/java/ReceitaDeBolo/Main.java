package ReceitaDeBolo;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2423
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int farinhaDeTrigo = sc.nextInt();
        int ovos = sc.nextInt();
        int colheresDeleite = sc.nextInt();
        int cont = 0;

        while (farinhaDeTrigo > 0 && ovos > 0 && colheresDeleite > 0) {
            if (farinhaDeTrigo >= 2 && ovos >= 3 && colheresDeleite >= 5) {
                cont++;
                farinhaDeTrigo = farinhaDeTrigo - 2;
                ovos = ovos - 3;
                colheresDeleite = colheresDeleite - 5;
            } else {
                farinhaDeTrigo = 0;
                ovos = 0;
                colheresDeleite = 0;
            }
        }
        System.out.println(cont);
    }
}
