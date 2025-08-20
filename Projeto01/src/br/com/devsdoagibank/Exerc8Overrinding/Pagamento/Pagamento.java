package br.com.devsdoagibank.Exerc8Overrinding.Pagamento;

public abstract class Pagamento {
    public double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento genérico de R$" + valor);
    }

}
