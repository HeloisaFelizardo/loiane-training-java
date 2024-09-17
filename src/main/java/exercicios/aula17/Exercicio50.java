package exercicios.aula17;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
        } else {
            double soma = 0.0;

            for (int i = 1; i <= n; i++) {
                soma += 1.0 / i;
                System.out.print("1/" + i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }

            System.out.println("\nH = " + String.format("%.2f", soma));
        }

        entrada.close();
    }
}
