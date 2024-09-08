package exercicios.aula15;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = entrada.nextLine().trim().toLowerCase();
        entrada.close();

        // Verifica se o usuário digitou apenas uma letra
        if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("A letra digitada é vogal.");
            } else {
                System.out.println("A letra digitada é consoante.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite apenas uma letra.");
        }
    }
}
