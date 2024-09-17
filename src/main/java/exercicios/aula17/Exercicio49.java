package exercicios.aula17;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = entrada.nextInt();

        double soma = 0.0;
        int m = 1;

        for (int i = 1; i <= n; i++) {
            soma += (double) i / m;
            System.out.print(i + "/" + m);
            if (i < n) {
                System.out.print(" + ");
            }
            m += 2;
        }

        System.out.println("\nSoma da série: " + String.format("%.2f", soma));

        entrada.close();
    }
}
