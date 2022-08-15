//https://www.beecrowd.com.br/judge/pt/problems/view/2312
package QuadroDeMedalhas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMedalhas = sc.nextInt();

        List<Medalha> medalhas = new ArrayList<>();
        for (int i = 0; i < nMedalhas; i++) {
            medalhas.add(new Medalha(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        medalhas.sort((a, b) -> {
            if (a.medalhaOuro < b.medalhaOuro) {
                return 1;
            } else if (a.medalhaOuro > b.medalhaOuro) {
                return -1;
            } else {
                if (a.medalhaPrata < b.medalhaPrata) {
                    return 1;
                } else if (a.medalhaPrata > b.medalhaPrata) {
                    return -1;
                } else {
                    if (a.medalhaBronze < b.medalhaBronze) {
                        return 1;
                    } else if (a.medalhaBronze > b.medalhaBronze) {
                        return -1;
                    }
                }
                return a.nomePais.compareTo(b.nomePais);
            }
        });
        for (Medalha medalha : medalhas) {
            System.out.println(medalha.nomePais + " " + medalha.medalhaOuro + " " + medalha.medalhaPrata + " " + medalha.medalhaBronze);
        }

    }
}
class Medalha {
    String nomePais;
    int medalhaOuro;
    int medalhaPrata;
    int medalhaBronze;

    public Medalha(String pais, int medalhaOuro, int medalhaPrata, int medalhaBronze) {
        this.nomePais = pais;
        this.medalhaOuro = medalhaOuro;
        this.medalhaPrata = medalhaPrata;
        this.medalhaBronze = medalhaBronze;
    }
}
