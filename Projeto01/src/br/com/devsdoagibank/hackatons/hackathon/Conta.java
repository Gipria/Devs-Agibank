package br.com.devsdoagibank.hackatons.hackathon;

public abstract class Conta implements OperacoesBancarias {
    private double numeroConta;
    private double saldo;

    public Conta(String nome, String cpf, double numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public abstract void AplicarJuros();

}


