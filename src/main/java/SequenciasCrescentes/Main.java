package SequenciasCrescentes;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1146
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x != 0) {
            x = sc.nextInt();
            for (int i = 1; i <= x; i++) {
                System.out.print(i);
                if( i == x){
                    System.out.print("\n");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}

