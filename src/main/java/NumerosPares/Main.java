package NumerosPares;

//https://www.beecrowd.com.br/judge/pt/problems/view/1059
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}