package br.com.devsdoagibank.Exerc8Overrinding.Pagamento;

import br.com.devsdoagibank.Exerc8Overrinding.Pagamento.PagamentoCartaoCredito;
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartaoCredito(400, "947385-98");
        Pagamento pagamento2 = new PagamentoPix(200, "chavinha");
        Pagamento pagamento3 = new Pagamento(300)

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
    }
}
