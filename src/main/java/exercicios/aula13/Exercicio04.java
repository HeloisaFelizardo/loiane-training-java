package exercicios.aula13;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota do 1 bimestre: ");
        System.out.println("Digite a nota do 2 bimestre: ");
        System.out.println("Digite a nota do 3 bimestre: ");
        System.out.println("Digite a nota do 4 bimestre: ");
        double nota1 = entrada.nextInt();
        double nota2 = entrada.nextInt();
        double nota3 = entrada.nextInt();
        double nota4 = entrada.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media é: " + media);

    }
}
