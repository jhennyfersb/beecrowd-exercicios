package Gangorra;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2455
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int p1 = sc.nextInt();
        int c2 = sc.nextInt();
        int p2 = sc.nextInt();

        if(c1 * p1 == c2 * p2){
            System.out.println("0");
        }else if(c1 * p1 > c2 * p2){
            System.out.println("-1");
        }else {
            System.out.println("1");
        }
    }
}