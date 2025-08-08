package br.com.devsdoagibank.Exerc01;
import java.util.Scanner;

public class ConvertMoeda {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor em reais: ");
        double real = sc.nextDouble();

        double taxa = 4.90;

        double result = real / taxa;

        System.out.printf("%.2f%n",result);

        sc.close();
    }



}
