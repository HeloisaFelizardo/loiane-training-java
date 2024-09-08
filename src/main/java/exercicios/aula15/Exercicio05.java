package exercicios.aula15;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite duas notas parciais de um aluno: ");
        Double nota1 = entrada.nextDouble();
        Double nota2 = entrada.nextDouble();
        entrada.close();
        Double media = (nota1 + nota2) / 2;

        if((media == 10)){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
