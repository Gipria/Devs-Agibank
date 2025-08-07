package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args){

        float alt, peso, imc;

        Scanner num  = new Scanner(System.in);
        System.out.print("Digite sua altura:");
        alt = num.nextFloat();
        System.out.print("Digite seu peso:");
        peso = num.nextFloat();

        imc = peso / (alt * alt);
        System.out.println("IMC : " + imc);

        if(imc < 18.5){
            System.out.println("Magreza");
        }
        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudável");
        }
        if(imc >= 24.9 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        }
        if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau II");
        }
        if(imc > 40.0){
            System.out.println("Obesidade Grau III");
        }


        num.close();


    }

}
