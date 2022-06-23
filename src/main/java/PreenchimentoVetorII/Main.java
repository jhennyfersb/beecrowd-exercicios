package PreenchimentoVetorII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1177
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int X = 0;
        List<Integer> N = new ArrayList<>(1000);

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + X);
            if (X == T-1) {
                X = 0;
            } else {
                X++;
            }
            N.add(X);
        }
    }
}
