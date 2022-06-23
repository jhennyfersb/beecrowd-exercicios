package NomeNoFormulario;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2160
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  texto = sc.nextLine();

        if(texto.length() <= 80){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
