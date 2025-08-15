package br.com.devsdoagibank.Exerc5.ControleEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemEstoque> estoque = new ArrayList<>();

        while(true) {
            System.out.print("\n1- Adicionar item");
            System.out.print("2-Exibir estoque");
            System.out.print("3-Remover item");
            System.out.print("4- Sair");
            int opcao = sc.nextInt();
            sc.nextLine(); //limpar

            switch(opcao){
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    Double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    estoque.add( new ItemEstoque(nome, preco, quantidade));
            }

        }

    }
}
