package InterfacesFuncionais;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("jhennyfer");
        palavras.add("sou");
        palavras.add("eu");

        //palavras.sort((s1,s2) -> (s1.length() - s2.length()));
        /*palavras.sort((s1,s2)->{
            if(s1.length() < s2.length()) return 1;
            else if(s1.length() > s2.length()) return  -1;
            return 0;
        });*/
        //palavras.sort(Comparator.comparing(s -> s.length()));
        //palavras.sort(String.CASE_INSENSITIVE_ORDER);
        new Thread(()-> System.out.println("Executando um Runnable")).start();
        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);
    }
}

