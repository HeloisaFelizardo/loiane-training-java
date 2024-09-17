package exercicios.aula17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do atleta: ");
            String nome = scan.nextLine();
            if (nome.isEmpty()) {
                break;
            }

            List<Double> saltos = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite a marca do " + (i + 1) + "º salto: ");
                double marca = scan.nextDouble();
                saltos.add(marca);
            }
            scan.nextLine(); // Limpa o buffer após o uso de nextDouble

            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);

            // Exibir os saltos na ordem
            System.out.println("Atleta: " + nome);
            System.out.println("Primeiro Salto: " + saltos.get(0) + " m");
            System.out.println("Segundo Salto: " + saltos.get(1) + " m");
            System.out.println("Terceiro Salto: " + saltos.get(2) + " m");
            System.out.println("Quarto Salto: " + saltos.get(3) + " m");
            System.out.println("Quinto Salto: " + saltos.get(4) + " m");

            // Calculando a média sem o melhor e o pior salto
            double somaSaltos = 0;
            for (double salto : saltos) {
                somaSaltos += salto;
            }
            double media = (somaSaltos - melhorSalto - piorSalto) / 3;

            // Exibindo os resultados
            System.out.println("Melhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + String.format("%.1f", media) + " m");
            System.out.println("Resultado final:");
            System.out.println(nome + ": " + String.format("%.1f", media) + " m");
        }

        scan.close();
    }
}
