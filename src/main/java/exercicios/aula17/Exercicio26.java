package exercicios.aula17;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o numero total de eleitores? ");
        int totalEleitores = entrada.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosInvalidos = 0;

        for (int i = 0; i < totalEleitores; i++) {
            System.out.println("Digite o número do candidato que deseja votar (1, 2 ou 3): ");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    votosInvalidos++;
                    System.out.println("Voto inválido!");
                    break;
            }
        }

        System.out.println("Resultado da eleição: ");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        System.out.println("Votos inválidos: " + votosInvalidos);

        entrada.close();
    }
}
