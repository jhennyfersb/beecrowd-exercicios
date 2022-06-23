package Tuitando;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2165
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String twitter = sc.nextLine();

        if (twitter.length() <= 140) {
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }

    }
}