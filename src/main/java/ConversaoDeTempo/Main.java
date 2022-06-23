package ConversaoDeTempo;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1019
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int convercaoHoras = n/3600;
        n = n%3600;
        int conversaoMinutos = n/60;
        int segundos = n%60;
        System.out.println(convercaoHoras + ":" + conversaoMinutos +":" + segundos);

    }

}