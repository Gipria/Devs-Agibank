package br.com.devsdoagibank.Exerc5.ContaBancaria;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public Double saldo;


    public void depositar(double valor){
        System.out.print("Depositando");
    }
    public void sacar(double valor){
        System.out.print("Sacando");
    }

    public void exibirSaldo(){
        System.out.print("" + saldo);
    }

}
