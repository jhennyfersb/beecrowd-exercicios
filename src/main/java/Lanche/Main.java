package Lanche;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1038
class Produto{
    int codigo;
    double preco;
    int quantidadeProduto;
    double calcularProduto(){

        if(codigo == 1){
            preco = 4.00;
        }else if(codigo == 2){
            preco = 4.50;
        }else if(codigo == 3){
            preco = 5.00;
        }else if(codigo == 4){
            preco = 2.00;
        }else if(codigo == 5){
            preco = 1.50;
        }
        return this.preco*quantidadeProduto;
    }

}

public class Main {


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        produto.codigo = sc.nextInt();
        produto.quantidadeProduto = sc.nextInt();
        produto.calcularProduto();
        System.out.format("Total: R$ %.2f\n",produto.calcularProduto());
    }




}