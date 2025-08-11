/*1. Tendência de Alta em Ações
Crie um programa que:
Receba um vetor com os preços diários de uma ação ao longo de 10 dias.

Use métodos para:
primeiraTrincaAlta(double[] precos) → retorna os índices da primeira trinca de alta (ou null se não existir).
primeiraTendenciaAlta(double[] precos) → retorna os índices da primeira tendência com pelo menos 3 dias de alta consecutivos.
todasTendenciasAlta(double[] precos) → retorna uma lista com todas as tendências de alta.*/



package br.com.devsdoagibank.Exerc3;
import java.util.Arrays;
import java.util.Scanner;

public class TendenciaAlta {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int quantidade = 10;
        double[] precos = new double[quantidade];

        //Iniciando e lendo todos precos
        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite o valor da ação dia " + (i+ 1) + ": ");
            precos[i] = sc.nextDouble();
        }
        //teste
        for(int i = 0; i < quantidade; i++)
            if(precos[i] < precos[i +1] && precos[i+1] < precos[i+2])
        System.out.print(Arrays.toString(precos));

        // verificando se teve tres dias de alta
        for(int i =0; i <= precos.length - n; i++) {                 // i <= precos.length(tamanho total do array) - n -> garante que a janela nao saia do array
            double soma = 0;
            for (int j = i; j < i + n; j++) {                         //for anda dentro da janela, J comeca em I(posicao incial da janela) e vai ate i+n-1 (ultima posicao da janela)
                soma += precos[j];
            }

            System.out.print(soma);
        }
        //double primeiraTrincaAlta = ;


    }

}