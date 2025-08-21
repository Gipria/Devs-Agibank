/*
Tema: Interface
Interfaces e Classes: IDescontavel, ProdutoComum, ProdutoPromocional
Enunciado:
Crie uma interface IDescontavel com o método:
public double calcularPrecoFinal(double precoBase);

Depois, crie duas classes que implementam essa interface:
ProdutoComum: aplica 5% de desconto sobre o preço base.
ProdutoPromocional: aplica 20% de desconto sobre o preço base.
Por fim, crie uma classe MainProduto que instancie os dois tipos de produto e exiba os preços finais com desconto.
*/

package br.com.devsdoagibank.Exerc9Interface.Produto;

public class Main {
    public static void main(String[] args) {
        IDescontavel prodDesc1 = new ProdutoComum();
        IDescontavel prodDesc2 = new ProdutoPromocional();

        System.out.println("a" + prodDesc1);
        System.out.println("b" + prodDesc2);

    }



}
