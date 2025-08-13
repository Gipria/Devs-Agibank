/* 4. Identificação do Maior e Menor Valor de uma Ação
Crie um programa que:
Receba os preços de fechamento de uma ação durante 10 dias.

Use os métodos:
maiorPreco(double[] precos) → retorna o maior preço.
menorPreco(double[] precos) → retorna o menor preço.
*/

package br.com.devsdoagibank.Exerc3;

import java.util.Scanner;

public class MaiorMenorAcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 10;
        double[] precos = new double[quantidade];

        //Iniciando e lendo todos precos
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o valor da ação dia " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        double maior = maiorPreco(precos);
        double menor = menorPreco(precos);

        System.out.println("Maior preço: " + maior);
        System.out.println("Menor preço: " + menor);

        sc.close();
    }


        public static double maiorPreco(double [] precos){
            double maior = precos[0];
            for (int i = 0; i  < precos.length; i++) {
                if (precos[i] > maior) {
                    if (precos[i] > maior) {
                        maior = precos[i];
                    }
                }
            }
            return maior;
        }

        public static double menorPreco ( double[] precos){
            double menor = precos[0];
            for (int i = 0; i < precos.length; i++) {
                if (precos[i] < menor) {
                    if (precos[i] < menor) {
                        menor = precos[i];
                    }
                }
            }
            return menor;
        }
    }