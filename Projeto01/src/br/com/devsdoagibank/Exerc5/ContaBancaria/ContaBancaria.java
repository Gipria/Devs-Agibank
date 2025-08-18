package br.com.devsdoagibank.Exerc5.ContaBancaria;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;


    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }

    //Metodo depositar(double valor) só aceitar valores positivos

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
        else{
            System.out.print("Valor invalido");
        }
    }

    //Metodo sacar(double valor) Só permite saque se houver saldo suficiente
    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Valor de saldo insuficiente.");
        }
    }

    //Crie um metodo exibirExtrato() para mostrar os dados da conta e o saldo atual.
    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + saldo);
    }
/*
    public void depositar(double valor){
        System.out.print("Depositando");
    }

    public void exibirSaldo(){
        System.out.print("" + saldo);
    }
*/
}
