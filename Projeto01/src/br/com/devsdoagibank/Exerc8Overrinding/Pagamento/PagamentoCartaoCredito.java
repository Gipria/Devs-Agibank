package br.com.devsdoagibank.Exerc8Overrinding.Pagamento;

public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;
    public PagamentoCartaoCredito(double valor, String numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " com Cartão de Crédito");

    }
}
