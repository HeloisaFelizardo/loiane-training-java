package exercicios.aula17;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        // Troca os números se num1 for maior que num2
        if (num2 < num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        System.out.println("Números inteiros entre " + num1 + " e " + num2 + ":");
        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }

        entrada.close();
    }
}

