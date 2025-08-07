package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class Impar {
    public static void main(String[] args){
        int numero;

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um numero:  ");
        numero = num.nextInt();

        if(numero % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }

        num.close();


    }
}
