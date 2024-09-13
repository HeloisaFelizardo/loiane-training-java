package exercicios.aula17;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço do pão: ");
        double precoPao = entrada.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d - R$ %.2f%n", i, i * precoPao);
        }

        entrada.close();
    }
}
