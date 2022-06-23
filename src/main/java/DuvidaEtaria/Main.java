package DuvidaEtaria;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/3141
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        String dataAtual = sc.next();
        String dataNascimento = sc.next();

        String[] splitDataAtual = dataAtual.split("/");
        String[] splitDataNascimento = dataNascimento.split("/");

        int diaAtual = Integer.parseInt(splitDataAtual[0]);
        int mesAtual = Integer.parseInt(splitDataAtual[1]);
        int anoAtual = Integer.parseInt(splitDataAtual[2]);
        int diaAniversario = Integer.parseInt(splitDataNascimento[0]);
        int mesAniversario = Integer.parseInt(splitDataNascimento[1]);
        int anoAniversario = Integer.parseInt(splitDataNascimento[2]);
        int idade = anoAtual - anoAniversario;


        if (mesAniversario == mesAtual) {
            if (diaAniversario == diaAtual) {
                System.out.println("Feliz aniversario!");
            } else if (diaAniversario > diaAtual) {
                idade = idade - 1;
            }
        } else if (mesAniversario > mesAtual) {
            idade = idade - 1;
        }
        System.out.println("Voce tem " + idade + " anos " + nome + ".");
    }

}
