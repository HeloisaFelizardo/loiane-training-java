package exercicios.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double populacaoPaisA;
        double populacaoPaisB;
        double taxaCrescimentoPaisA;
        double taxaCrescimentoPaisB;
        boolean repetirOperacao;

        do {
            // Entrada de dados para o país A
            populacaoPaisA = lerDouble("Informe a população do país A:", entrada);

            // Entrada de dados para o país B
            populacaoPaisB = lerDouble("Informe a população do país B:", entrada);

            // Entrada de dados para a taxa de crescimento do país A
            taxaCrescimentoPaisA = lerDouble("Informe a taxa de crescimento anual da população do país A (%):", entrada);

            // Entrada de dados para a taxa de crescimento do país B
            taxaCrescimentoPaisB = lerDouble("Informe a taxa de crescimento anual da população do país B (%):", entrada);

            int anos = 0;

            // Cálculo do número de anos para a população do país A ultrapassar a população do país B
            while (populacaoPaisA < populacaoPaisB) {
                populacaoPaisA += (populacaoPaisA * taxaCrescimentoPaisA / 100);
                populacaoPaisB += (populacaoPaisB * taxaCrescimentoPaisB / 100);
                anos++;
            }

            System.out.println("Após " + anos + " anos, a população do país A ultrapassará a população do país B.");

            // Pergunta se o usuário deseja repetir a operação
            System.out.println("Deseja repetir a operação? (S/N)");
            repetirOperacao = entrada.next().equalsIgnoreCase("S");

        } while (repetirOperacao);

        entrada.close();
    }

    private static double lerDouble(String mensagem, Scanner entrada) {
        double valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println(mensagem);
                valor = entrada.nextDouble();
                if (valor <= 0) {
                    System.out.println("O valor deve ser maior que zero.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                entrada.next(); // Limpa o buffer do scanner
            }
        }
        return valor;
    }
}
