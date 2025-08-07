package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        int numero;

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um numero:  ");
        numero = num.nextInt();

        if (numero > 0){
            System.out.println("Numero positivo");
        }
        if(numero < 0){
            System.out.println("Numero negativo");
        }
        if(numero == 0){
            System.out.println("Numero igual a zero");
        }

        num.close();
    }
}
