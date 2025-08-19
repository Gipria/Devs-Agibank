package br.com.devsdoagibank.Exerc7Heranca.ProdutoPerecivel;


// SUBCLASSE de Produto (herança)
public class ProdutoPerecivel extends Produto{
    // Atributo
        public String dataValidade;


    // Construtor da subclasse ProdutoPerecivel
    // Recebe todos os dados necessários, incluindo os da superclasse

    public ProdutoPerecivel(String codigo, String nome, String dataValidade, double preco){
        // Chama o construtor da superclasse Produto com os dados necessários
        super(codigo, nome, preco);

        // Atribui o valor da data de validade ao atributo específico da subclasse
        this.dataValidade = dataValidade;

    }

    // Método que verifica se o produto está vencido com base em uma data passada
    public String estaVencido(String dataAtual){
        if(dataAtual != null){  // Verifica se a data atual foi fornecida (não é null)
            return "Segue a data: " + dataValidade;  // // Retorna a data de validade se houver uma data atual
        } else {
            // Se não houver data atual, retorna null (ou o que foi passado)
            return dataAtual;
        }
    }

}
