package br.com.devsdoagibank.Exerc7Heranca.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacarComChequeEspecial(double valor) {
        if (valor <= getSaldo() + limiteChequeEspecial) {  //Getsaldo porque ele esta privado
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
