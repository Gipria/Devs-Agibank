package br.com.devsdoagibank.Exerc9Interface.Produto;

public class ProdutoPromocional implements IDescontavel{
    public double calcularPrecoFInal(double precoBase) {
        return precoBase * 0.20;
    }
}
