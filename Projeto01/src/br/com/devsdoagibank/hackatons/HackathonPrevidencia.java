/*package br.com.devsdoagibank.hackatons;
import java.util.Scanner;

public class HackathonPrevidencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Variáveis principais (poderão ser preenchidas na opção 1)
        int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0;
        double contribuicaoMensal = 0;
        double[] taxasAnuais = null;
        double[] saldoAnual = null;
        double[][] matrizCenarios = null;
        double[] rendaMensal = null;

        do {
            System.out.println("\n===== MENU SIMULADOR DE PREVIDÊNCIA =====");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Calcular saldo anual (vetor)");
            System.out.println("3 - Gerar matriz de cenários");
            System.out.println("4 - Calcular renda mensal na aposentadoria");
            System.out.println("5 - Exibir todos os resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // >>> INSERIR DADOS (ler do usuário e armazenar nas variáveis)
                    System.out.print("Idade Atual");
                    idadeAtual = sc.nextInt();
                    System.out.print("Idade desejada para aposentadoria");
                    idadeAposentadoria = sc.nextInt();
                    System.out.print("Contribuição mensal (P)");
                    contribuicaoMensal = sc.nextDouble();
                    System.out.print("Taxa de juros anual esperada (%)");
                    taxasAnuais = new double[]{sc.nextDouble()};
                    break;

                case 2:
                    // >>> CHAMAR O MÉTODO calcularSaldoAnual() e armazenar no vetor saldoAnual

                    break;

                case 3:
                    // >>> CHAMAR O MÉTODO gerarMatrizCenarios() e armazenar na matriz matrizCenarios
                    break;

                case 4:
                    // >>> CHAMAR O MÉTODO calcularRendaMensal() e armazenar no vetor rendaMensal
                    break;

                case 5:
                    // >>> CHAMAR O MÉTODO exibirResultados() para mostrar tudo
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("⚠ Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    // ================================
    // ===== MÉTODOS ESTÁTICOS ========
    // ================================

    // 1. Cálculo do saldo acumulado ano a ano (Vetor)
    public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaAnual) {
        // >>> IMPLEMENTAR O CÁLCULO DO SALDO

        double saldo = 0;

        double taxaMensal = taxaAnual / 12 / 100;

        for (int ano = 0; ano < anosContribuicao; ano++) {
            for (int mes = 0; mes < 12; mes++) {
                // Aporte mensal + juros sobre o saldo anterior
                saldo = (saldo + contribuicaoMensal) * (1 + taxaMensal);
            }
            saldoAnual[ano] = saldo; // Armazena o saldo ao final do ano
        }


        int anosContribuicao = idadeAposentadoria - idadeAtual;
        double[] saldoAnual = new double[anosContribuicao];
        double mesesContribuicao = idadeAposentadoria - idadeAtual;
        double taxaMensal = 0;
        saldoAnual = contribuicaoMensal * Math.pow((1 + taxaMensal)) mesesContribuicao - 1) / taxaMensal;
        //S = P * ((1 + r)^n - 1) / r
        // (onde r = taxa mensal, n = meses de contribuição)



        System.out.print(saldoAnual);
        return saldoAnual;

    }

    // 2. Projeção com cenários diferentes (Matriz)
    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
        // >>> IMPLEMENTAR O CÁLCULO DA MATRIZ DE CENÁRIOS
        return null;
    }

    // 3. Cálculo da renda mensal na aposentadoria
    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
        // >>> IMPLEMENTAR O CÁLCULO DA RENDA MENSAL PARA CADA CENÁRIO
        return null;
    }

    // 4. Exibir todos os resultados
    public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasAnuais, double[] rendaMensal) {
        // >>> IMPLEMENTAR A EXIBIÇÃO DOS RESULTADOS
        System.out.println(saldoAnual);
        System.out.println(saldoAnual);
        System.out.println(saldoAnual);
    }
}
*/