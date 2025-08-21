package br.com.devsdoagibank.Exerc8Overrinding.Pagamento;

import br.com.devsdoagibank.Exerc8Overrinding.Pagamento.PagamentoCartaoCredito;
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartaoCredito(400, "947385-98");
        Pagamento pagamento2 = new PagamentoPix(200, "chavinha");


        pagamento1.processarPagamento(100);
        pagamento2.processarPagamento(120);
    }
}
