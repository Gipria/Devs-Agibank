/*2. Dada uma matriz 3x4 que representa dívidas mensais de 3 clientes em 4 meses, crie um método para encontrar o maior valor da matriz.
double encontrarMaiorValor(double[][] matriz);
*/
package br.com.devsdoagibank.Exerc4;

public class maiorValorMatriz {
    public static double encontrarMaiorValor(double[][] matriz){
        double maior = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            for(int c = 0; c < matriz[l].length; c++){
                if(matriz[l][c]> maior){
                    maior=matriz[l][c];
                };
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        double[][] mat={{100,101,110},
                         {90,107,110},
                         {80,107,170},
                         {90,107,130}};

        System.out.println("Maior divida: " + encontrarMaiorValor(mat));
    }
}
