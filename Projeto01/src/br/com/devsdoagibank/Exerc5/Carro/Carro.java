package br.com.devsdoagibank.Exerc5.Carro;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    //Metodo para acelerar o carro
    public void acelerar(){
        System.out.println(("O carro ta acelerando"));
    }

    // Método para frear o carro
    public void frear(){
        System.out.println("O carro ta freiando");
    }

    //metodo pra mostrar as informacoes

    public void mostrarInformacoes(){
        System.out.println(this.modelo);
        System.out.println(this.marca);
        System.out.println(this.ano);
    }

}
