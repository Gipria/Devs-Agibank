package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class PercMedia {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor:");

        double valor = sc.nextDouble();
        System.out.print("Digite a média: ");
        double media = sc.nextDouble();

        //double diferenca = Math.abs(valor - media);


        double diferenca = Math.abs(valor - media);

        double result = media / (diferenca * 100);

        System.out.println(result);
    }

}
