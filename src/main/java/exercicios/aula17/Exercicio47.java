package exercicios.aula17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do atleta: ");
        String nome = scan.nextLine();

        List<Double> notas = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            double nota = scan.nextDouble();
            notas.add(nota);
        }
        scan.nextLine(); // Limpa o buffer após o uso de nextDouble

        double melhorNota = Collections.max(notas);
        double piorNota = Collections.min(notas);

        // Exibir as notas na ordem
        System.out.println("Atleta: " + nome);
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota: " + notas.get(i));
        }

        // Calculando a média sem a melhor e a pior nota
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = (somaNotas - melhorNota - piorNota) / 5;

        // Exibindo os resultados
        System.out.println("Resultado final:");
        System.out.println("Atleta: " + nome);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.println("Média: " + String.format("%.2f", media));

        scan.close();
    }
}
