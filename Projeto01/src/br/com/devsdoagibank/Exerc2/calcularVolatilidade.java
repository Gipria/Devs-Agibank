/*6. Implemente calcularVolatilidade() que recebe um array de retornos diários e retorna o desvio padrão dos
retornos.
Exemplo: {0.01, 0.02, -0.01, 0.03, -0.02} => Saída: 0.018*/

package br.com.devsdoagibank.Exerc2;

import java.util.Scanner;

public class calcularVolatilidade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("============= Calculadora desvio padrao =============");
        System.out.println("Quantos valores voce quer inserir pra fazer o calculo? ");
        int n = sc.nextInt();

        double[] valores =  new double[n];

        //Iniciando o for e lendo todos os valores
        for(int i = 0; i < n;i++ ){
            System.out.println("Digite o valor " + (i+1) + ": ");
            valores[i] = sc.nextDouble();
        }

        //calculando a media

        double soma = 0;
        for(double valor : valores){   // loop "foreach" Significado: Para cada elemento do array `valores`, faca o que estiver dentro das chaves{}
            soma += valor;
        }
        double media = soma/n;

        //Calculando a soma dos quadrados das diferenças entre cada valor e a média

        double somaQuadrado = 0;
        for(double valor : valores){
            double diff =  valor - media;
            somaQuadrado += diff * diff;
        }

        //calculando a variancia (dividindo por n para populacao)
        double variancia = somaQuadrado/n;

        //Calculando Desvio Padrao
        double desvioPadrao = Math.sqrt(variancia);

        System.out.printf("o desvio padrao e: " + desvioPadrao);

        sc.close();
    }
}
