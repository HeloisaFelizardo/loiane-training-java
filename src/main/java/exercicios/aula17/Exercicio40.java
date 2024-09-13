package exercicios.aula17;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double maiorIndiceDeAcidentes = Double.MIN_VALUE;
        double menorIndiceDeAcidentes = Double.MAX_VALUE;
        int codigoCidadeMaiorIndice = 0;
        int codigoCidadeMenorIndice = 0;
        int totalVeiculos = 0;
        int totalAcidentesMenos2000 = 0;
        int totalVeiculosCidades2000 = 0;

        for (int i = 1; i <= 5; i++) {  // Ajustado para 5 cidades
            System.out.println("Código da cidade: ");
            int codigoCidade = entrada.nextInt();

            System.out.println("Número de veículos de passeio: ");
            int numeroVeiculosPasseio = entrada.nextInt();

            System.out.println("Número de acidentes de trânsito com vítimas: ");
            int numeroAcidentes = entrada.nextInt();

            // Cálculo do índice de acidentes
            double indiceDeAcidentes = (double) numeroAcidentes / numeroVeiculosPasseio;

            // Verificação de maior e menor índice de acidentes
            if (indiceDeAcidentes > maiorIndiceDeAcidentes) {
                maiorIndiceDeAcidentes = indiceDeAcidentes;
                codigoCidadeMaiorIndice = codigoCidade;
            }

            if (indiceDeAcidentes < menorIndiceDeAcidentes) {
                menorIndiceDeAcidentes = indiceDeAcidentes;
                codigoCidadeMenorIndice = codigoCidade;
            }

            // Acumulando dados para a média de veículos
            totalVeiculos += numeroVeiculosPasseio;

            // Verificação para cidades com menos de 2.000 veículos
            if (numeroVeiculosPasseio < 2000) {
                totalAcidentesMenos2000 += numeroAcidentes;
                totalVeiculosCidades2000 += numeroVeiculosPasseio;
            }
        }

        double mediaVeiculos = totalVeiculos / 5.0;
        double mediaAcidentesMenos2000 = (double) totalAcidentesMenos2000 / totalVeiculosCidades2000;

        System.out.println("Cidade com maior índice de acidentes: "
                + codigoCidadeMaiorIndice + " com " + String.format("%.2f",maiorIndiceDeAcidentes) + " acidentes por veículo");
        System.out.println("Cidade com menor índice de acidentes: "
                + codigoCidadeMenorIndice + " com " + String.format("%.2f",menorIndiceDeAcidentes) + " acidentes por veículo");
        System.out.println("Média de veículos nas cidades: " + String.format("%.2f",mediaVeiculos));
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio: " + String.format("%.2f",mediaAcidentesMenos2000));

        entrada.close();
    }
}
