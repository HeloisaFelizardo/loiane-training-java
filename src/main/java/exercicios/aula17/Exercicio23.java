package exercicios.aula17;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = entrada.nextInt();

        int totalDivisoes = 0;

        System.out.println("Números primos entre 1 e " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            // Verifica se 'i' é um número primo
            for (int j = 2; j <= Math.sqrt(i); j++) {
                totalDivisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmero total de divisões executadas: " + totalDivisoes);

        entrada.close();
    }
}
