//https://www.beecrowd.com.br/judge/pt/problems/view/1281
package IdaAFeira;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantVoltas = sc.nextInt();
        while (quantVoltas > 0) {
            double valorCompra = 0.0;
            Map<String, Double> prodFeiras = new TreeMap<>();

            int quantFeira = sc.nextInt();

            for (int i = 0; i < quantFeira; i++) {
                prodFeiras.put(sc.next(), sc.nextDouble());
            }
            int quantCompras = sc.nextInt();
            for (int i = 0; i < quantCompras; i++) {
                String prodCompras = sc.next();
                int quantProduto = sc.nextInt();
                if (prodFeiras.containsKey(prodCompras)) {
                    valorCompra += prodFeiras.get(prodCompras) * quantProduto ;
                }
            }
            System.out.format("R$ %.2f\n",valorCompra);
            quantVoltas --;
        }
    }
}

