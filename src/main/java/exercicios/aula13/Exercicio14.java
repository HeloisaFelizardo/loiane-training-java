package exercicios.aula13;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double excesso = 0;
        double multa = 0;

        System.out.println("Qual o peso dos peixes? ");
        double peso = entrada.nextDouble();

        if(peso > 50){
            excesso = peso - 50;
            multa = excesso * 4.00;
            System.out.printf("O excesso de peso foi de : %.3f kg%n", excesso);
            System.out.printf("Valor da multa: %.2f R$%n", multa);
        }else {
            System.out.printf("O excesso de peso foi de : %.3f kg%n", excesso);
            System.out.printf("Valor da multa: %.2f R$%n", multa);
        }

        entrada.close();
    }
}
