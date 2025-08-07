package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {          // em java funcao se chama metodo
        int idade;

        Scanner sc = new Scanner(System.in);          //instancia do objeto 'sc'
        System.out.print("Digite sua idade: ");       //Saida
        idade = sc.nextInt();                         //Entrada
        System.out.printf("Você tem %d anos", idade); //Saida

        sc.close(); // se nao fechar ele nao limpa o cache e é boas praticas

    }
}
