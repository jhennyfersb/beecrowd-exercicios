//https://www.beecrowd.com.br/judge/pt/problems/view/2174
package ColeçãoDePomekon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> pokemon = new HashSet<>();
        int qtPokemon = sc.nextInt();
        for (int i = 0; i < qtPokemon; i++) {
            pokemon.add(sc.next());
        }
        int quantosFaltam = 151 - pokemon.size();
        System.out.println("Falta(m) " + quantosFaltam + " pomekon(s).");
    }
}
