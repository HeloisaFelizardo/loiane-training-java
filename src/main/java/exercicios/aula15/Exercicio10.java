package exercicios.aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que turno você estuda? ");
        String turno = entrada.nextLine().trim().toUpperCase();

        if (turno.length() == 1 && Character.isLetter(turno.charAt(0))) {
            switch (turno) {
                case "M" -> System.out.println("Bom dia!");
                case "V" -> System.out.println("Boa tarde!");
                case "N" -> System.out.println("Boa noite!");
                default -> System.out.println("Valor inválido!");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite apenas uma letra.");
        }
    }
}
