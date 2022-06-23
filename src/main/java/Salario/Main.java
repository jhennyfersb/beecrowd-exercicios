package Salario;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1008
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int nFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + nFuncionario);
        System.out.format("SALARY = U$ %.2f\n", salario);



    }

}