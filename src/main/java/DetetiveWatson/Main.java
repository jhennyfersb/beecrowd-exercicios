package DetetiveWatson;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1533
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while (numero != 0) {
            int maior = 0;
            int posicaoMaior = 0;
            int segundoMaior = 0;
            int posicaoSegundoMaior = 0;
            ArrayList<Integer> assasinos = new ArrayList<>();

            for (int i = 0; i < numero; i++) {
                assasinos.add(sc.nextInt());
            }
            for (int i = 0; i < assasinos.size(); i++) {
                if (assasinos.get(i) > maior) {
                    segundoMaior = maior;
                    posicaoSegundoMaior = posicaoMaior;
                    maior = assasinos.get(i);
                    posicaoMaior = i;
                } else if (assasinos.get(i) > segundoMaior) {
                    segundoMaior = assasinos.get(i);
                    posicaoSegundoMaior = i;
                }
            }
            System.out.println(posicaoSegundoMaior + 1);
            numero = sc.nextInt();
        }
    }
}
