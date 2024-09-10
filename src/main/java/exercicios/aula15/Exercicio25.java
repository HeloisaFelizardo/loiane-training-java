package exercicios.aula15;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Mensagens de perguntas
        System.out.println("Telefonou para a vítima? (S/N) ");
        System.out.println("Esteve no local do crime? (S/N) ");
        System.out.println("Mora perto da vítima? (S/N) ");
        System.out.println("Devia para a vítima? (S/N) ");
        System.out.println("Já trabalhou com a vítima? (S/N) ");

        int respostasPositivas = 0;

        // Processa as respostas
        for (int i = 0; i < 5; i++) {
            String resposta = entrada.next().trim().toUpperCase(); // Normaliza a entrada
            if (resposta.equals("S")) {
                respostasPositivas++;
            } else if (!resposta.equals("N")) {
                System.out.println("Resposta inválida. Por favor, digite 'S' ou 'N'.");
                i--; // Decrementa o índice para refazer a pergunta
            }
        }

        // Determina o grau de envolvimento
        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        entrada.close();
    }
}
