package PecaPerdida;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2322
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pecas = new ArrayList<>();
        int numero = sc.nextInt();
        for (int i = 0; i < numero - 1; i++) {
            pecas.add(sc.nextInt());
        }
        for (int i = 1; i <= numero; i++) {
            if (!pecas.contains(i)) {
                System.out.println(i);
                break;
            }
        }

    }
}
