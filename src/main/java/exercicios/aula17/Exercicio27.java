package exercicios.aula17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de turmas: ");
        int turmas = entrada.nextInt();

        int somaAlunos = 0;

        for (int i = 1; i <= turmas; i++) {
            System.out.println("Quantidade de alunos na turma " + i + ": ");
            int alunosPorTurma = entrada.nextInt();

            // Verifica se a quantidade de alunos é válida
            while (alunosPorTurma > 40 || alunosPorTurma < 1) {
                System.out.println("Número inválido de alunos. Deve ser entre 1 e 40.");
                System.out.println("Digite novamente a quantidade de alunos na turma " + i + ": ");
                alunosPorTurma = entrada.nextInt();
            }

            somaAlunos += alunosPorTurma;
        }

        double mediaDeAlunosPorTurma = (double) somaAlunos / turmas;

        System.out.println("A média de alunos por turma é: " + mediaDeAlunosPorTurma);

        entrada.close();
    }
}
