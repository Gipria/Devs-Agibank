package br.com.devsdoagibank.Exerc9Interface.Pagamento;

public class PagamentoCartaoCredito implements Pagamento{
    private String numeroCartao;
    public PagamentoCartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento de R$" + valor + "valor");
    }
}
