package PreenchimentoDeVetorI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1173
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dobro = 0;
        List<Integer> V = new ArrayList<>(10);
        V.add(N);
        System.out.println("N[0] = " + V.get(0));
        for (int i = 1; i < 10; i++) {
            dobro = 2 * (V.get(i - 1));
            V.add(2 * (V.get(i - 1)));
            System.out.println("N[" + i + "] = " + dobro);
        }
    }
}