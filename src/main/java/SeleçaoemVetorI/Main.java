package SeleçaoemVetorI;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1174
public class Main {
    public static void verificarArray(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10) {
                System.out.print("A[" + i + "] = ");
                System.out.println(vetor[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[100];


        for (int i = 0; i < vetor.length; i++) {
            double numero = sc.nextDouble();
            vetor[i] = numero;
        }
        verificarArray(vetor);

    }

}