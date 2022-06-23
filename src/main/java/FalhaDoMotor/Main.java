package FalhaDoMotor;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.beecrowd.com.br/judge/pt/problems/view/2167

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> motor = new ArrayList<>();
        int numero = sc.nextInt();
        int posicao = 0;
        for (int i = 0; i < numero; i++) {
            motor.add(sc.nextInt());
        }
        for (int i = 1; i < numero; i++) {
            if (motor.get(i) < motor.get(i-1)) {
                posicao = i+1;
                break;
            }
        }
        System.out.println(posicao);
    }
}