package exercicios.aula15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite duas notas:");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.println("Notas: " + nota1 + " e " + nota2);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 9.0 && media <= 10.0) {
            System.out.println("Conceito: A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Conceito: C");
            System.out.println("Aprovado");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito: D");
            System.out.println("Reprovado");
        } else if (media >= 0 && media < 4.0) {
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        } else {
            System.out.println("Erro: Média inválida");
        }

        entrada.close();
    }
}
