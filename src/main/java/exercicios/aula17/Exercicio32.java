package exercicios.aula17;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o fatorial de N: ");
        int n = entrada.nextInt();

        System.out.println("Fatorial de: " + n );
        System.out.print(n+ "! = ");
        int fatorial = 1;

        // Loop para calcular o fatorial
        for (int i = n; i >= 1; i--) {
            fatorial *= i;

            // Imprime o número com o formato correto, sem o ponto final após o último número
            if (i == 1) {
                System.out.print(i); // Sem o ponto no último número
            } else {
                System.out.print(i + " . ");
            }
        }

        // Exibe o resultado do fatorial
        System.out.println(" = " + fatorial);

        entrada.close();
    }
}
