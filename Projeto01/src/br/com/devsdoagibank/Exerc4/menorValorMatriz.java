/*4. Dada uma matriz 2x3 com preços de produtos em 2 lojas, crie um método para encontrar o menor preço de cada produto (mínimo por coluna).
double[] encontrarMenorPrecoPorProduto(double[][] matriz);
*/
package br.com.devsdoagibank.Exerc4;

public class menorValorMatriz {
    public static double[] encontrarMenorPrecoporProduto(double[][] matriz){
        double menor;
        double[] menorpreco= new double[matriz[0].length];
        for (int p = 0; p < matriz[0].length; p++) {  // percorre cada coluna (produto)
            menor = matriz[0][p];
            for (int l = 0; l < matriz.length; l++) { // percorre cada linha (loja)
                if(matriz[l][p] < menor){
                    menor=matriz[l][p];
                }
            }
            menorpreco[p] = menor;//tem que ser fora do for pois sabemos o resultado depois de rodar tudo
        }
        return menorpreco;
    }

    public static void main(String[] args) {

    }
}
