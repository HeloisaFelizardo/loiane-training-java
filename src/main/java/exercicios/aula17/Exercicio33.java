package exercicios.aula17;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorTemperatura = Integer.MIN_VALUE;
        int menorTemperatura = Integer.MAX_VALUE;
        int totalTemperatura = 0;
        int count = 0;  // Variável para contar quantas temperaturas foram informadas

        while (true) {
            System.out.println("Informe a temperatura em graus Celsius (ou digite -999 para sair): ");
            int celsius = entrada.nextInt();

            if (celsius == -999) {
                break;  // Termina o ‘loop’ quando o usuário digitar -999
            }

            if (celsius > maiorTemperatura) {
                maiorTemperatura = celsius;
            }

            if (celsius < menorTemperatura) {
                menorTemperatura = celsius;
            }

            totalTemperatura += celsius;
            count++;
        }

        // Verifica se houve ao menos uma temperatura válida inserida
        if (count > 0) {
            double mediaTemperatura = (double) totalTemperatura / count;

            System.out.printf("Maior temperatura: %d°C%n", maiorTemperatura);
            System.out.printf("Menor temperatura: %d°C%n", menorTemperatura);
            System.out.printf("Média das temperaturas: %.2f°C%n", mediaTemperatura);
        } else {
            System.out.println("Nenhuma temperatura válida foi informada.");
        }

        entrada.close();
    }
}