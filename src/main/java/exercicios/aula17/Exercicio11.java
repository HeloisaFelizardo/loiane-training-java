package exercicios.aula17;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int soma = 0;

        for (int i = num1 + 1; i < num2; i++) {
            soma += i;
        }

        System.out.println("A soma dos números inteiros entre " + num1 + " e " + num2 + " é: " + soma);

        entrada.close();
    }
}
