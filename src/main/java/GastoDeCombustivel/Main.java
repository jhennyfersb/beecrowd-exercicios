package GastoDeCombustivel;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1017
public class Main {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tempoViagem = sc.nextInt();
        // Tempo gasto na viagem em horas
        int velocidadeMediaViagem = sc.nextInt();
        // Velocidade nedia durante viagem em km/h
        double distanciaViagem = velocidadeMediaViagem * tempoViagem;
        int consumoAutomovel = 12;
        // Automóvel faz 12km/L
        double litros = distanciaViagem/consumoAutomovel;
        System.out.format("%.3f\n" ,litros);
        
 
      
    }
 
}