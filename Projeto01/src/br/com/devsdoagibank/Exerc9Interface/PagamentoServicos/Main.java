package br.com.devsdoagibank.Exerc9Interface.PagamentoServicos;

import br.com.devsdoagibank.Exerc9Interface.Produto.IDescontavel;

public class Main {
    public static void main(String[] args) {
        IPagamento metodo1 = new PagamentoCartao();
        IPagamento metodo2 = new PagamentoBoleto();

        System.out.println("Pagou cartao" + metodo1);
        System.out.println("Pagou Boleto" + metodo2);

        metodo1.processarPagamento(100);
        metodo2.processarPagamento(200);
    }
}
