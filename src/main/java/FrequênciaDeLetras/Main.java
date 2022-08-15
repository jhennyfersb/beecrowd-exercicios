//https://www.beecrowd.com.br/judge/pt/problems/view/1255
package FrequênciaDeLetras;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        Map<Character,Integer> repete = new HashMap<>();
        sc.next();
        while (casos != 0){
            String frase = sc.nextLine();
                String[] strings = frase.split(" ");
                for (int j = 0; j < strings.length; j++) {

                    repete.put(frase.charAt(j), 1);
                }
            }
            casos--;
        }
    }

