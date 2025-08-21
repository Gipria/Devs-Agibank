package br.com.devsdoagibank.Exerci9Abstrat.ContaBancaria;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, double saldo){
        super(numero,saldo);
    }

    public void atualizarMensal(){

        System.out.println("Saldo descontado: " + (saldo - 15));
    }

}

