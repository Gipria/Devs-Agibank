package br.com.devsdoagibank.Exerci9Abstrat.ContaBancaria;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }
    public void atualizarMensal(){
        System.out.println("Aumenta saldo" + (saldo * 0.05));
    }
}
