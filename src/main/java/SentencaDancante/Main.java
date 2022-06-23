package SentencaDancante;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1234
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String palavra = sc.nextLine();
            StringBuilder resposta = new StringBuilder();
            int cont = 0;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == ' ') {
                    resposta.append(' ');
                } else {
                    if (cont % 2 == 0) {
                        resposta.append(Character.toUpperCase(palavra.charAt(i)));
                    } else {
                        resposta.append(Character.toLowerCase(palavra.charAt(i)));
                    }
                    cont++;
                }
            }
            System.out.println(resposta);
        }
    }
}
