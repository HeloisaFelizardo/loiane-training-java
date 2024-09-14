package exercicios.aula17;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Candidatos a presidente: ");
        System.out.println("1. José");
        System.out.println("2. João");
        System.out.println("3. Maria");
        System.out.println("4. Ana");
        System.out.println("5. Nulo");
        System.out.println("6. Branco");
        System.out.println("0. Encerrar votação");

        int votosJose = 0;
        int votosJoao = 0;
        int votosMaria = 0;
        int votosAna = 0;
        int votosNulo = 0;
        int votosBranco = 0;
        int totalVotos;

        System.out.println();

        while (true) {
            System.out.print("Digite o número do candidato: ");
            int voto = scan.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    votosJose++;
                    break;
                case 2:
                    votosJoao++;
                    break;
                case 3:
                    votosMaria++;
                    break;
                case 4:
                    votosAna++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                default:
                    System.out.println("Voto inválido");
            }
        }

        System.out.println();

        System.out.println("O total de votos de José foi: " + votosJose);
        System.out.println("O total de votos de João foi: " + votosJoao);
        System.out.println("O total de votos de Maria foi: " + votosMaria);
        System.out.println("O total de votos de Ana foi: " + votosAna);
        System.out.println("O total de votos nulos foi: " + votosNulo);
        System.out.println("O total de votos brancos foi: " + votosBranco);

        totalVotos = votosJose + votosJoao + votosMaria + votosAna + votosNulo + votosBranco;

        double porcentagemVotosNulos = (double) (votosNulo * 100) / totalVotos;
        double porcentagemVotosBrancos = (double) (votosBranco * 100) / totalVotos;

        System.out.println("A porcentagem de votos nulos foi: " + porcentagemVotosNulos + "%");
        System.out.println("A porcentagem de votos brancos foi: " + porcentagemVotosBrancos + "%");

        scan.close();
    }
}
