package EntradaSaidaCPF;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2763
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cpf = sc.nextLine();

        for (int i = 0; i < cpf.length(); i++) {
            if (i == 3) {
                System.out.println();
            } else if (i == 7) {
                System.out.println();
            } else if (i == 11) {
                System.out.println();
            }else {
                System.out.print(cpf.charAt(i));
            }
        }
        System.out.println();
    }
}