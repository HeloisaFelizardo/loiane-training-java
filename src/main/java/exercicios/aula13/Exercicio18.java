package exercicios.aula13;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tamanho do arquivo para download (MB): ");
        double tamanhoMB = entrada.nextDouble();

        System.out.println("Velocidade do link da internet (Mbps): ");
        double velocidadeMbps = entrada.nextDouble();

        // Cálculo do tempo em segundos
        double tempoSegundos = (tamanhoMB * 8) / velocidadeMbps;

        // Convertendo o tempo para minutos
        double tempoMinutos = tempoSegundos / 60;

        System.out.printf("Tempo aproximado de download em minutos: %.2f%n", tempoMinutos);

        entrada.close();
    }
}
