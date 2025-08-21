package br.com.devsdoagibank.Exerc9Interface.PagamentoServicos;

public class PagamentoBoleto implements IPagamento{
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento de R$" + valor + " realizado o boleto Bancario");
    }
}
