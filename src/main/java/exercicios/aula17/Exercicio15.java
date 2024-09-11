package exercicios.aula17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = entrada.nextInt();

        int a = 1, b = 1;
        System.out.print("Sequência de Fibonacci até " + n + " termos: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        entrada.close();
    }
}
