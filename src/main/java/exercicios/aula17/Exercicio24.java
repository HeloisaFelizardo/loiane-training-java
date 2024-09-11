package exercicios.aula17;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("O número de notas deve ser maior que zero.");
            entrada.close();
            return;
        }

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota do aluno: ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += notas[i];
        }

        double media = soma / n;

        System.out.println("Notas: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Média: " + String.format("%.2f", media));

        entrada.close();
    }
}