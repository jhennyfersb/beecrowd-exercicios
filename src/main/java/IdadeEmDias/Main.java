package IdadeEmDias;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1020
public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int ano = idade/365 ;
        int x = idade%365;
        int mes = x/30;
        int dia = x%30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }

}