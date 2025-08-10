package br.com.devsdoagibank.Exerc01;

import java.util.Scanner;

public class calcMediaMovel {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);                        // Scanner le os dados digitados pelo usuario e sc e o nome que eu to dando pra ele ler

        System.out.print("Quantos preços voce deseja informar: ");
        int quantidade = sc.nextInt();                              // ta esperando o tipo inteiro que vc digitar

        double[] precos = new double[quantidade];                   // cria um array(lista) que vai guardar os valores do tipo double e [quantidade] vai ate onde o usuario determinou

        //Lendo os preços

        for(int i = 0; i < quantidade; i++){                       // inicio do laço for, o i usado para saber a posicao do array, o i++ siginifica some 1 ao valor de i a cada repeticao, e o que faz o for avancar para o proximo
            System.out.print("Digite o preço " + (i+ 1) + ": ");   // i+1 para soar mais natural para o usuario porque geralmente as coisas iniciam no 1
            precos[i] = sc.nextDouble();                           //precos[i] guarda o numero no array precos, na posicao i
        }
        System.out.print("Digite o intervalo que deseja calcular: ");
        int n = sc.nextInt();

        // Calculando

        for(int i =0; i <= precos.length - n; i++){                 // i <= precos.length(tamanho total do array) - n -> garante que a janela nao saia do array
            double soma = 0;                                        //antes de iniciar o calculo da media comecamos com a soma zerada
            for(int j = i; j < i + n; j++){                         //for anda dentro da janela, J comeca em I(posicao incial da janela) e vai ate i+n-1 (ultima posicao da janela)
                soma += precos[j];                                  //pegue o valor do array nessa posicao e adicione na soma
            }
            double media = soma/ n;
            System.out.printf("%.2f%n\n", media);
        }
        sc.close();



        }
    }

