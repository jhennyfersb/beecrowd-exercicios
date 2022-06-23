package ValidadorDeSenhas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2253
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String senha;
        while ((senha = in.readLine()) != null) {
            int contAlfabetoMinusculo = 0;
            int contAlfabetomaisculo = 0;
            int contNumero = 0;
            int contpontos = 0;

            for (int i = 0; i < senha.length(); i++) {
                if (Character.isAlphabetic(senha.charAt(i))) {
                    if (Character.isLowerCase(senha.charAt(i))) {
                        contAlfabetoMinusculo++;
                    } else if (Character.isUpperCase(senha.charAt(i))) {
                        contAlfabetomaisculo++;
                    }
                } else if (Character.isDigit(senha.charAt(i))) {
                    contNumero++;
                } else {
                    contpontos++;
                }
            }
            if (contAlfabetoMinusculo > 0 && contAlfabetomaisculo > 0 && contNumero > 0 && contpontos <= 0) {
                if (senha.length() > 5 && senha.length() < 33) {
                    System.out.println("Senha valida.");
                } else {
                    System.out.println("Senha invalida.");
                }
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}

