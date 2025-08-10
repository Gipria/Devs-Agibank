/* 5. Crie um método chamado compararAtivos() que recebe dois retornos médios e retorna o ativo com maior
retorno.
Exemplo: Ativo 1: 5.0%, Ativo 2: 4.5% => Saída: Ativo 1 */


package br.com.devsdoagibank.Exerc2;

import java.util.Scanner;

public class CompararAtivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem do tivo 1 : ");
        double ativo1 = sc.nextDouble();

        System.out.println("Digite a porcentagem do tivo 2: ");
        double ativo2 = sc.nextDouble();


        if(ativo1>ativo2){
            System.out.printf("Ativo 1 é melhor");
        }else{
            System.out.printf("Ativo 2 é melhor");
        }

    }
}
