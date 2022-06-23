package ZeroValeZero;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1871
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        while (a != 0 & b != 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a != 0 & b != 0) {
                int soma = a + b;
                if (soma > 0) {
                    StringBuilder s = new StringBuilder("" + soma);
                    for (int i = 0; i < s.length(); ) {
                        if (s.charAt(i) == '0') {
                            s = s.deleteCharAt(i);
                        } else {
                            i++;
                        }
                    }
                    System.out.println(s);
                }
            }
        }
    }
}
