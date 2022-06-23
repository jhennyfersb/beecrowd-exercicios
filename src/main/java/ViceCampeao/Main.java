package ViceCampeao;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2408
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int campeao = 0;
        int vice = 0;

        if (a > b) {
            campeao += a;
            vice += b;
            if (vice > c) {
                campeao = a;
                vice = b;
            } else if (c > a) {
                campeao = c;
                vice = a;
            } else {
                campeao = a;
                vice = c;
            }
        } else {
            campeao += b;
            vice += a;
            if (vice > c) {
                campeao = b;
                vice = a;
            } else if ( c > b){
                campeao = c;
                vice = b;
            }else {
                campeao = b;
                vice = c;
            }
        }
        System.out.println(vice);
    }
}
