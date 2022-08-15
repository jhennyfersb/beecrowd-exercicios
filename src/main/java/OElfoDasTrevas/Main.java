//https://www.beecrowd.com.br/judge/pt/problems/view/1766
package OElfoDasTrevas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= numeroCasos; i++) {
            List<Rena> renas = new ArrayList<>();
            int totalRenas = sc.nextInt();
            int cenario = sc.nextInt();
            for (int j = 0; j < totalRenas; j++) {
                renas.add(new Rena(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble()));
            }
            renas.sort((a, b) -> {
                if (a.peso < b.peso) {
                    return 1;
                } else if (a.peso > b.peso) {
                    return -1;
                } else {
                    if (a.idade < b.idade) {
                        return -1;
                    } else if (a.idade > b.idade) {
                        return 1;
                    } else {
                        if (a.altura < b.altura) {
                            return -1;
                        } else if (a.altura > b.altura) {
                            return 1;
                        }
                    }
                    return a.nome.compareTo(b.nome);
                }
            });
            System.out.println("CENARIO {" + i + "}");
            for (int k = 1; k <= cenario; k++) {
                Rena rena = renas.get(k - 1);
                System.out.println(k + " - " + rena.nome  /*+ " " + rena.peso + " " + rena.idade + " " + rena.altura*/);
            }
        }
    }

    static class Rena {
        String nome;
        int peso;
        int idade;
        double altura;

        public Rena(String nome, int peso, int idade, double altura) {
            this.nome = nome;
            this.peso = peso;
            this.idade = idade;
            this.altura = altura;
        }
    }
}
