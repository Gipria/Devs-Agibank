package br.com.devsdoagibank.hackatons.hackathon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Scanner sc = new Scanner();

    // Criando conta
    Cliente novocliente = new Cliente("Joaquim Meireles", "947385-98");
    System.out.println("Cliente criado com sucesso!" + novocliente.getNome());

    // Criando conta corrente e poupanca

    Conta contaCorrente = new ContaCorrente(novocliente.getNome(), novocliente.getCpf(),435,10000);
    Conta contaPoupanca = new ContaPoupanca(novocliente.getNome(), novocliente.getCpf(),100,2000 );

    // Fazendo operacoes de saque, deposito e juros
    contaCorrente.sacar(100);
    System.out.println("Valor saque: " + contaCorrente.getSaldo());
    contaCorrente.depositar(200);
    System.out.println("Valor deposito: " + contaCorrente.getSaldo());
    contaCorrente.AplicarJuros();
    //Aqui nao alterará por conta que nao aplica em contaCorrente
    System.out.println("Valor juros: " + contaCorrente.getSaldo());


    contaPoupanca.sacar(100);
    System.out.println("Valor saque: " + contaPoupanca.getSaldo());
    contaPoupanca.depositar(200);
    System.out.println("Valor deposito: " + contaPoupanca.getSaldo());
    contaPoupanca.AplicarJuros();
    System.out.println("Valor juros: " + contaPoupanca.getSaldo());

}}
