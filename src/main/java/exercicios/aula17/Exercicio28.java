package exercicios.aula17;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de CDs: ");
        int cds = entrada.nextInt();

        double valorTotal = 0;

        for (int i = 0; i < cds; i++) {
            System.out.println("Digite o valor do CD " + (i + 1) + ": ");
            double valor = entrada.nextDouble();
            valorTotal += valor;
        }

        double valorMedio = valorTotal / cds;

        System.out.printf("Valor total gasto em CDs: R$ %.2f%n", valorTotal);
        System.out.printf("Valor médio gasto em cada CD: R$ %.2f%n", valorMedio);

        entrada.close();
    }
}
