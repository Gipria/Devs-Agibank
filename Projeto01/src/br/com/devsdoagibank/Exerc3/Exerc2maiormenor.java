package br.com.devsdoagibank.Exerc3;

import java.util.Scanner;

public class Exerc2maiormenor {
    public static double maiorPreco(double[] precos) {
        double maior = precos[0]; //Assumindo que o primeiro valor do array é o maior por enquanto

        for (double p : precos){ // (for-each) percorrendo todos os elementos do array 'precos'
            if (p> maior){    // Se encontrar valor um valor maior que o atual
                maior = p;    //atualiza a variavel 'maior'
            }
        }
        return maior;
    }

    public static double menorPreco(double[] precos) {
        double menor = precos[0];
        for (double p : precos) {
            if (p < menor) {
                menor = p;
            }
        }
        return menor;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 10;
        double[] precos = new double[quantidade];

        //Lendo
        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite o valor da ação do dia " + (i +1) + ": ");
            precos[i] = sc.nextDouble();
        }

        // Utilizando os metodos acima
        double maior = maiorPreco(precos);
        double menor = menorPreco(precos);

        System.out.println("Maior preço: " + maior);
        System.out.println("Menor preço: " + menor);

        sc.close();
    }
}
