package br.com.devsdoagibank.Exerc5.Carro;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto da clase carro
        Carro meuCarro = new Carro();   // Instancia objeto meuCarro executando o construtor implicito

        meuCarro.mostrarInformacoes();

        meuCarro.marca="Toyota";
        meuCarro.modelo="Corola";
        meuCarro.ano=2022;

        //Usando os métodos do objeto
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.mostrarInformacoes();
    }
}
