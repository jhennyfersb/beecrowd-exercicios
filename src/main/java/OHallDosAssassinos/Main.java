//https://www.beecrowd.com.br/judge/pt/problems/view/1861
package OHallDosAssassinos;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Pessoa> pessoaMap = new TreeMap<>();

        while (sc.hasNext()) {
            String nomeAssassino = sc.next();
            String nomeAssasinado = sc.next();

            if (pessoaMap.containsKey(nomeAssassino)) {
                Pessoa assassino = pessoaMap.get(nomeAssassino);
                assassino.qtdQueEleMatou++;
                pessoaMap.put(nomeAssassino, assassino);
            } else {
                Pessoa pessoa = new Pessoa(nomeAssassino);
                pessoa.qtdQueEleMatou++;
                pessoaMap.put(nomeAssassino, pessoa);
            }
            if (pessoaMap.containsKey(nomeAssasinado)) {
                Pessoa quemMorreu = pessoaMap.get(nomeAssasinado);
                quemMorreu.morreu = true;
                pessoaMap.put(quemMorreu.nome, quemMorreu);
            } else {
                Pessoa quemMorreu = new Pessoa(nomeAssasinado);
                quemMorreu.morreu = true;
                pessoaMap.put(nomeAssasinado, quemMorreu);
            }


        }
        Collection<Pessoa> pessoas = new ArrayList<>(pessoaMap.values());
        System.out.println("HALL OF MURDERERS");
        for (Pessoa pessoa : pessoas) {
            if (!pessoa.morreu && pessoa.qtdQueEleMatou > 0) {
                System.out.println(pessoa.nome + " " + pessoa.qtdQueEleMatou);
            }
        }
    }

    static class Pessoa {
        String nome;
        Boolean morreu = false;
        Integer qtdQueEleMatou = 0;

        public Pessoa(String nome) {
            this.nome = nome;
        }
    }
}