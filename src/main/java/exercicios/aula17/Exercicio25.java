package exercicios.aula17;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de N de pessoas: ");
        int n = entrada.nextInt();

        int [] pessoas = new int[n];

        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa: ");
            pessoas[i] = entrada.nextInt();
            soma += pessoas[i];
        }

        double media = (double) soma / n;

        if(media <= 25){
            System.out.println("A turma é jovem.");
        } else if(media <= 60){
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }

        entrada.close();
    }
}
