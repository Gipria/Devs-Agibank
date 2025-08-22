package br.com.devsdoagibank.hackatons.hackathon;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nome, String cpf, double numeroConta, double saldo) {
        super(nome, cpf, numeroConta, saldo);
    }

    @Override
    public void AplicarJuros(){
        setSaldo(getSaldo()*1.01);
        System.out.println("Juros aplicado");
    }
}
