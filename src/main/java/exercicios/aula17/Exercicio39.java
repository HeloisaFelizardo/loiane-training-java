package exercicios.aula17;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0;
        int numeroAlunoMaisBaixo = 0;
        double alturaMaisAlto = Double.MIN_VALUE;
        double alturaMaisBaixo = Double.MAX_VALUE;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Digite o número do aluno " + i + ": ");
            int numeroAluno = entrada.nextInt();

            System.out.println("Digite a altura do aluno " + i + ": ");
            double alturaAluno = entrada.nextDouble();

            if(alturaAluno > alturaMaisAlto) {
                alturaMaisAlto = alturaAluno;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if(alturaAluno < alturaMaisBaixo) {
                alturaMaisBaixo = alturaAluno;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("Aluno mais alto: " + numeroAlunoMaisAlto + " com " + alturaMaisAlto + " m");
        System.out.println("Aluno mais baixo: " + numeroAlunoMaisBaixo + " com " + alturaMaisBaixo + " m");

        entrada.close();
    }
}
