package FraseCompleta;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1551
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String frase = sc.nextLine();
            StringBuilder alfabeto = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
            int cont = 0;
            for (int j = 0; j < frase.length(); j++) {
                int indexAlfabeto = alfabeto.indexOf(String.valueOf(frase.charAt(j)));
                if (indexAlfabeto >= 0) {
                    alfabeto.deleteCharAt(indexAlfabeto);
                    cont++;
                }
            }
            if (cont == 26){
                System.out.println("frase completa");
            }else if(cont >= 13 && cont < 26){
                System.out.println("frase quase completa");
            }else {
                System.out.println("frase mal elaborada");
            }
        }
    }
}