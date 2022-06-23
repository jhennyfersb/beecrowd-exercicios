package DesafioMaiorNumero;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2414
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        int zero = sc.nextInt();

        while (zero!= 0){
            x.add(zero);
            zero = sc.nextInt();
        }
        Integer max = x.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
