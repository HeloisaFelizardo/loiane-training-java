package exercicios.aula15;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 notas parciais de um aluno: ");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        entrada.close();

        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            System.out.println("Notas inválidas. As notas devem estar entre 0 e 10.");
        } else {
            double media = (nota1 + nota2 + nota3) / 3;

            if (media == 10) {
                System.out.println("Aprovado com distinção");
            } else if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("Média: " + media);
        }
    }
}
