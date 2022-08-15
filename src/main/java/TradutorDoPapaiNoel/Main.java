//https://www.beecrowd.com.br/judge/pt/problems/view/1763
package TradutorDoPapaiNoel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> feliznatais = new HashMap();

        feliznatais.put("brasil", "Feliz Natal!");
        feliznatais.put("alemanha", "Frohliche Weihnachten!");
        feliznatais.put("austria", "Frohe Weihnacht!");
        feliznatais.put("coreia", "Chuk Sung Tan!");
        feliznatais.put("espanha", "Feliz Navidad!");
        feliznatais.put("grecia", "Kala Christougena!");
        feliznatais.put("estados-unidos", "Merry Christmas!");
        feliznatais.put("inglaterra", "Merry Christmas!");
        feliznatais.put("australia", "Merry Christmas!");
        feliznatais.put("portugal", "Feliz Natal!");
        feliznatais.put("suecia", "God Jul!");
        feliznatais.put("turquia", "Mutlu Noeller");
        feliznatais.put("argentina", "Feliz Navidad!");
        feliznatais.put("chile", "Feliz Navidad!");
        feliznatais.put("mexico", "Feliz Navidad!");
        feliznatais.put("antardida", "Merry Christmas!");
        feliznatais.put("canada", "Merry Christmas!");
        feliznatais.put("irlanda", "Nollaig Shona Dhuit!");
        feliznatais.put("belgica", "Zalig Kerstfeest!");
        feliznatais.put("italia", "Buon Natale!");
        feliznatais.put("libia", "Buon Natale!");
        feliznatais.put("siria", "Milad Mubarak!");
        feliznatais.put("marrocos", "Milad Mubarak!");
        feliznatais.put("japao", "Merii Kurisumasu!");

        //sc.nextLine();
        while (sc.hasNext()) {
            System.out.println(feliznatais.getOrDefault(sc.nextLine(), "--- NOT FOUND ---"));
        }

    }
}

