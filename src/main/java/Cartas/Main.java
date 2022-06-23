package Cartas;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2456
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cartas = new ArrayList<>();
        int contCrescente = 0;
        int contDecrescente = 0;
        
        for (int i = 0; i < 5; i++) {
            cartas.add(sc.nextInt());
        }
        for (int i = 0; i < 4; i++) {
            if (cartas.get(i) < cartas.get(i + 1)) {
                contCrescente++;
            }else if(cartas.get(i) > cartas.get(i+1)){
                contDecrescente++;
            }
        }
        if (contCrescente == 4){
            System.out.println("C");
        }else if ((contDecrescente == 4)){
            System.out.println("D");
        }else {
            System.out.println("N");
        }
    }
}

