/*1. Crie um método para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um método que calcule a soma total de todos os elementos da matriz.
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz);
*/

package br.com.devsdoagibank.Exerc4;

import java.util.Scanner;

public class VetUnidim {
    public static void preencherMatriz(double[][] matriz){
        Scanner sc = new Scanner(System.in);

        for (int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){ // coletando o numero de colunas com o matriz[].length
                System.out.print("Digite o valor: ");
                matriz[l][c] = sc.nextDouble();
            }
        }
    }

    public static double calcularSomaTotal(double[][] matriz){
        double soma = 0;
        for (int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                soma+=matriz[l][c]; // soma=soma+matriz[l][c]
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        preencherMatriz(matriz);
        double total = calcularSomaTotal(matriz);
        calcularSomaTotal(matriz);
        //total = calcularSomaTotal(matriz);
        System.out.println("total de receitas e despesas " + total);
    }
}
