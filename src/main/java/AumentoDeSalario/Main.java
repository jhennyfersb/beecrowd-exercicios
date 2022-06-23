package AumentoDeSalario;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1048
class Funcionario {
    double novoSalario;
    double reajuste;
    int percentual;

    public void calcularReajusteSalario(double salario ){
        if ( salario >= 0 && salario <= 400.00){
            this.percentual = 15;
            this.reajuste = salario * (percentual / 100.0);
            this.novoSalario = salario + reajuste;
        }else if ( salario > 400.00 && salario <= 800.00 ){
            this.percentual = 12;
            this.reajuste = salario * (percentual / 100.0);
            this.novoSalario = salario + reajuste;
        }else if(salario > 800.00 && salario <= 1200.00){
            this.percentual = 10;
            this.reajuste = salario * (percentual / 100.0);
            this.novoSalario = salario + reajuste;
        }else if( salario > 1200.00 && salario <= 2000.00){
            this.percentual = 7;
            this.reajuste = salario * (percentual / 100.0);
            this.novoSalario = salario + reajuste;
        }else if( salario > 2000.00){
            this.percentual = 4;
            this.reajuste = salario * (percentual / 100.0);
            this.novoSalario = salario + reajuste;
        }

    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        funcionario.calcularReajusteSalario(sc.nextDouble());
        System.out.format("Novo salario: %.2f\n" ,funcionario.novoSalario );
        System.out.format("Reajuste ganho: %.2f\n" , funcionario.reajuste);
        System.out.println("Em percentual: " + funcionario.percentual + " %");


    }
}