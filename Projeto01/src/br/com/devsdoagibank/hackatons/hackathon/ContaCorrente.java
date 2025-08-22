package br.com.devsdoagibank.hackatons.hackathon;

public class ContaCorrente extends Conta {
    public ContaCorrente(String nome, String cpf, double numeroConta, double saldo) {
        super(nome, cpf, numeroConta, saldo);
    }

    @Override
    public void AplicarJuros(){
        System.out.println("Juros nao aplicado");
    }
}
