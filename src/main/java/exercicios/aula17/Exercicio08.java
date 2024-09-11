package exercicios.aula17;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite cinco números inteiros.");

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            int numero = entrada.nextInt();

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);

        double media = soma / 5.0;
        System.out.println("A média dos números digitados é: " + media);

        entrada.close();
    }
}
