/*2. Variação Percentual de Preços
Crie um programa que:
Receba um vetor com os preços diários de uma ação durante 5 dias.

Use o método variacaoDiaria(double[] precos), que retorne um vetor com as variações percentuais diárias.*/

package br.com.devsdoagibank.Exerc3;

public class VariacaoPercentualPreco {
    public static double[] variacaoDiaria(double[] precos){
       double[] variacao = new double[precos.length-1]; // menos 1 pra comecar do 0
       for(int i = 0 ; i <precos.length-1; i++){
            variacao[i] = ((precos[i] - precos[i+1])/precos[i])*100;
            }
       return variacao;
    }
    public static void main(String[] args){
        double[] precos = {100, 101, 102, 103, 104};
        double[] var= variacaoDiaria(precos);

        for(double v: var){
            System.out.println(v);
        }
    }
}
