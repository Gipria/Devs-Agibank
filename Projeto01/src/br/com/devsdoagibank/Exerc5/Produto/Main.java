package br.com.devsdoagibank.Exerc5.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.exibirDados();
        p1.adicionarEstoque(10);
        p1.removerEstoque(5);
        p1.exibirDados();
    }
}
