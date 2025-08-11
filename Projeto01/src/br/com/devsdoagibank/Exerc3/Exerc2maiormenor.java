package br.com.devsdoagibank.Exerc3;

public class Exerc2maiormenor {
    public static double maiorPreco(double[] precos) {
        double maior = precos[0];

        for (double p : precos){
            if (p> maior){
                maior = p;
            }
        }
        return maior;
    }
}
