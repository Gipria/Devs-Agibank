package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class calcJurosSimples {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o capital inicial: ");
        double valor_inicial = sc.nextDouble();

        System.out.print("Digite o valor da taxa em %:");
        double taxa = sc.nextDouble();

        System.out.print("Digite anos de investimento:");
        int anos = sc.nextInt();

        double resul = valor_inicial * taxa * anos;
        resul = resul + valor_inicial;

        System.out.printf("%.2f%n",resul);
    }
}
