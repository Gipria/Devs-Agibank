package br.com.devsdoagibank.Exerci9Abstrat.ContaBancaria;

abstract class Conta{
    protected int numeroConta;
    protected double saldo;

    public Conta(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public abstract void atualizarMensal();


}
