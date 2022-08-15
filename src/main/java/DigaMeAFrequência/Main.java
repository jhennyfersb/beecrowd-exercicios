//https://www.beecrowd.com.br/judge/pt/problems/view/1251
package DigaMeAFrequência;


import java.util.*;

import static java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Map<Character, Integer> charFreqMap = new HashMap<>();
            String text = sc.next();
            for (int i = 0; i < text.length(); i++) {
                Character character = text.charAt(i);
                if (charFreqMap.containsKey(character)) {
                    int frequenciaRepetida = charFreqMap.get(character);
                    charFreqMap.put(character, frequenciaRepetida + 1);
                } else {
                    charFreqMap.put(character, 1);
                }
            }
            List<Entry<Character, Integer>> listaCharFrequencia = new ArrayList<>(charFreqMap.entrySet());

            listaCharFrequencia.sort((o1, o2) -> {
                if (o1.getValue() < o2.getValue()) {
                    return -1;
                } else if (o1.getValue() > o2.getValue()) {
                    return 1;
                } else if (o1.getValue() == o2.getValue()) {
                    if (o1.getKey() < o2.getKey()) return 1;
                    else if (o1.getKey() > o2.getKey()) return -1;
                }
                return 0;
            });
            listaCharFrequencia.forEach(entry -> {
                System.out.println((int) entry.getKey() + " " + entry.getValue());
            });
            if (sc.hasNext()) {
                System.out.println();
            }
        }
    }
}


