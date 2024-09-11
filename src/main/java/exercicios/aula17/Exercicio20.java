package exercicios.aula17;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        do {
            System.out.println("Digite um número inteiro positivo menor que 16 para calcular o fatorial (ou um número fora desse intervalo para sair): ");
            n = entrada.nextInt();

            if (n > 0 && n < 16) {
                int fatorial = 1;
                System.out.print(n + "! = ");
                for (int i = n; i > 0; i--) {
                    fatorial *= i;
                    System.out.print(i);
                    if (i > 1) {
                        System.out.print(" x ");
                    }
                }
                System.out.println(" = " + fatorial);
            } else if (n >= 16) {
                System.out.println("Número inválido! Deve ser menor que 16.");
            } else if (n <= 0) {
                System.out.println("Número inválido! Deve ser positivo.");
            }

        } while (n > 0 && n < 16);

        entrada.close();
    }
}
