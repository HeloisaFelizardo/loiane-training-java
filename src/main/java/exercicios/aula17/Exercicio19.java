package exercicios.aula17;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite a quantidade de números: ");
        int n = entrada.nextInt();

        int[] numeros = new int[n];

        // Coleta e validação dos números
        for (int i = 0; i < n; i++) {
            int numero;
            do {
                System.out.println("Digite o número " + (i + 1) + " entre 0 e 1000: ");
                numero = entrada.nextInt();
                if (numero < 0 || numero > 1000) {
                    System.out.println("Número inválido! Deve estar entre 0 e 1000.");
                }
            } while (numero < 0 || numero > 1000);

            numeros[i] = numero;
        }

        // Processamento dos números
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma += numeros[i];
        }

        // Exibição dos resultados
        System.out.println("Números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);

        entrada.close(); // Fecha o Scanner
    }
}
