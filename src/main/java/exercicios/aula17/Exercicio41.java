package exercicios.aula17;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double valorDaDivida = entrada.nextDouble();

        System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela");

        double valorDoJuros;
        double valorDaParcela;
        int[] parcelas = {1, 3, 6, 9, 12};  // As quantidades de parcelas que o exercício especifica

        for (int quantidadeDeParcelas : parcelas) {
            switch (quantidadeDeParcelas) {
                case 1 -> valorDoJuros = 0;
                case 3 -> valorDoJuros = valorDaDivida * 0.10;
                case 6 -> valorDoJuros = valorDaDivida * 0.15;
                case 9 -> valorDoJuros = valorDaDivida * 0.20;
                case 12 -> valorDoJuros = valorDaDivida * 0.25;
                default -> throw new IllegalArgumentException("Quantidade de parcelas inválida");
            }

            double valorTotalComJuros = valorDaDivida + valorDoJuros;
            valorDaParcela = valorTotalComJuros / quantidadeDeParcelas;

            System.out.printf("R$ %.2f        R$ %.2f               %d                   R$ %.2f%n",
                    valorTotalComJuros, valorDoJuros, quantidadeDeParcelas, valorDaParcela);
        }

        entrada.close();
    }
}
