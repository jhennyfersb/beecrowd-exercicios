package SequenciaDeNumerosESoma;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1101
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        while (m > 0 && n > 0) {
            sum = 0;
            if (m > n) {
                for (int i = n; i <= m; i++) {
                    if (i == n) {
                        System.out.print(i);
                    } else {
                        System.out.print(" " + i);
                    }
                    sum = sum + i;
                }
            } else {
                for (int i = m; i <= n; i++) {
                    if (i == m) {
                        System.out.print(i);
                    } else {
                        System.out.print(" " + i);
                    }
                    sum = sum + i;
                }
            }
            System.out.println(" Sum=" + sum);
            m = sc.nextInt();
            n = sc.nextInt();
        }
    }
}
