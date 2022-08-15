package Curso;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    private final String nome;
    private final int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class Main {
    public static void main(String[] args){
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
        //Com lambda
        /*cursos.sort(Comparator.comparingInt(curso -> curso.getAlunos()));
        //Com reference
        cursos.sort(Comparator.comparingInt(Curso ::getAlunos));

        cursos.stream()
                .filter(curso -> curso.getAlunos() >50)
                .forEach(curso -> System.out.println(curso.getNome()));
        Stream<String> nomes = cursos.stream().map(Curso::getNome);*/

        /*cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .map(Curso::getNome)
                .forEach(System.out::println);*/
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst();
        cursos.stream()
                .mapToInt(c-> c.getAlunos())
                .average();
        List<Curso> cursosFiltrados = cursos.stream()
                .filter(c-> c.getAlunos() > 50)
                .collect(Collectors.toList());

        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        Period periodo = Period.between(agora,dataFutura);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateformater = dataFormatada.format(agora);
        System.out.println(agora);




    }
}
