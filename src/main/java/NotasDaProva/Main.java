package NotasDaProva;

import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/2344
class Aluno {
    int nota;

    public void converterNotas(int nota ){
        if(nota == 0){
            System.out.println("E");
        }else if (nota > 0 && nota <= 35){
            System.out.println("D");
        }else if(nota > 35 && nota <= 60){
            System.out.println("C");
        }else if(nota > 60 && nota <= 85){
            System.out.println("B");
        }else if(nota > 85 && nota <= 100){
            System.out.println("A");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        aluno.nota = sc.nextInt();
        aluno.converterNotas(aluno.nota);
    }
}

 