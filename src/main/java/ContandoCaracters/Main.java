package ContandoCaracters;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maior = "";
        String casos = "";
        List<String> frases = new ArrayList<>();
        while (!casos.contains("0")) {
            casos = sc.nextLine();
            if (!(casos.contains("0"))) {
                frases.add(casos);
            }
        }
            for (String frase : frases) {
                String[] strings = frase.split(" ");
                for (int i = 0; i < strings.length; i++) {
                    if (i == strings.length - 1) {
                        System.out.println(strings[i].length());
                    } else {
                        System.out.print(strings[i].length() + "-");
                    }
                    if (strings[i].length() >= maior.length()) {
                        maior = strings[i];
                    }
                }
            }

        System.out.println("\nThe biggest word: " + maior);
    }
}