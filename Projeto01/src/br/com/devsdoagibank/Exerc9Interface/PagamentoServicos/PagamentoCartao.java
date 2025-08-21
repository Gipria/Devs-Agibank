package br.com.devsdoagibank.Exerc9Interface.PagamentoServicos;

public class PagamentoCartao implements IPagamento{
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento de R$" + valor + " realizado via cartão de Crédito");
    }
}
