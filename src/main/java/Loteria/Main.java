package Loteria;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2473
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> aposta = new ArrayList<Integer>();
        ArrayList<Integer> sorteio = new ArrayList<Integer>();
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            aposta.add(sc.nextInt());
        }
        for (int i = 0; i < 6; i++) {
            sorteio.add(sc.nextInt());
        }

        for (Integer integer : aposta) {
            if (sorteio.contains(integer)) {
                cont++;
            }
        }
        switch (cont) {
            case 3:
                System.out.println("terno");
                break;
            case 4:
                System.out.println("quadra");
                break;
            case 5:
                System.out.println("quina");
                break;
            case 6:
                System.out.println("sena");
                break;
            default:
                System.out.println("azar");

        }
    }
}
