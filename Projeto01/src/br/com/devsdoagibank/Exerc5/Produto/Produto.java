package br.com.devsdoagibank.Exerc5.Produto;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade =+ quantidade; // o this e sempre um atribbuto na frente da classe, essa variavel e da classe, quando eu nao coloco eu digo essa aqui nao e uma propriedade da classe
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("quantidade: " + quantidade);
    }
}
