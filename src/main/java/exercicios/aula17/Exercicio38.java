package exercicios.aula17;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário inicial do funcionário: ");
        double salarioInicial = entrada.nextDouble();

        double percentual = 1.5;

        int anoContratacao = 1995;
        int anoAtual = 2005; // Você pode alterar para o ano atual

        System.out.printf("Salário em %d: R$ %.2f%n", anoContratacao, salarioInicial);

        for (int ano = 1996; ano <= anoAtual; ano++) {
            if (ano >= 1997) {
                percentual *= 2;
            }

            salarioInicial += (salarioInicial / 100) * percentual;
            System.out.printf("Salário em %d: R$ %.2f%n", ano, salarioInicial);
        }

        entrada.close();
    }
}
