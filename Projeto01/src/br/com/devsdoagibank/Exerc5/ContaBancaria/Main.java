package br.com.devsdoagibank.Exerc5.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // testar ContaBancaria

        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Matheus");
        cb.setNumeroConta("789");
        cb.depositar(1000);

        cb.sacar(5);
        cb.exibirExtrato();
    }
}
