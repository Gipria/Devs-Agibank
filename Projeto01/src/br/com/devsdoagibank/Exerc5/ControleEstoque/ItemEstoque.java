package br.com.devsdoagibank.Exerc5.ControleEstoque;

import java.util.Scanner;

public class ItemEstoque {
    public String nome;
    public Double preco;
    public int quantidade;

    Scanner sc = new Scanner(System.in);
    public ItemEstoque(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade){
        System.out.print("Adicionando no estoque.. ");
        this.quantidade += quantidade;
    }
    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: "+ quantidade);

    }
}
