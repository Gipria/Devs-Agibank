package br.com.devsdoagibank.Exerc7Heranca.ProdutoPerecivel;

// Declaração da classe chamada Produto
public class Produto {
    // Atributos privados da classe (só acessíveis dentro da própria classe)
        private String codigo;
        private String nome;
        private double preco;

        // Construtor da classe Produto
        // É chamado automaticamente quando um novo objeto Produto é criado

        public Produto(String codigo, String nome, double preco){
            // "this" se refere ao atributo da classe (à esquerda)

            this.codigo = codigo; // Atribui o código passado ao atributo da classe
            this.nome   = nome;
            this.preco  = preco;
        }

    public String getNome(String nome) {
            return nome;
    }
}
