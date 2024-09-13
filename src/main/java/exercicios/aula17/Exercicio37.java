package exercicios.aula17;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Inicialização das variáveis
        double maisAlto = Double.MIN_VALUE;
        double maisBaixo = Double.MAX_VALUE;
        double maisGordo = Double.MIN_VALUE;
        double maisMagro = Double.MAX_VALUE;

        int codigoMaisAlto = 0;
        int codigoMaisBaixo = 0;
        int codigoMaisGordo = 0;
        int codigoMaisMagro = 0;

        double totalAltura = 0;
        double totalPeso = 0;
        int count = 0;

        while (true) {
            System.out.println("Digite seu código (0 para encerrar): ");
            int codigo = entrada.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.println("Digite sua altura: ");
            double altura = entrada.nextDouble();

            System.out.println("Digite seu peso: ");
            double peso = entrada.nextDouble();

            // Atualiza as estatísticas
            if (altura > maisAlto) {
                maisAlto = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
                codigoMaisBaixo = codigo;
            }
            if (peso > maisGordo) {
                maisGordo = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < maisMagro) {
                maisMagro = peso;
                codigoMaisMagro = codigo;
            }

            totalAltura += altura;
            totalPeso += peso;
            count++;
        }

        if (count > 0) { // Evita divisão por zero se nenhum cliente for registrado
            System.out.printf("Mais alto: %.2f m - Código: %d%n", maisAlto, codigoMaisAlto);
            System.out.printf("Mais baixo: %.2f m - Código: %d%n", maisBaixo, codigoMaisBaixo);
            System.out.printf("Maior peso: %.1f Kg - Código: %d%n", maisGordo, codigoMaisGordo);
            System.out.printf("Menor peso: %.1f Kg - Código: %d%n", maisMagro, codigoMaisMagro);
            System.out.printf("Média altura: %.2f m%n", totalAltura / count);
            System.out.printf("Média peso: %.1f Kg%n", totalPeso / count);
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }

        entrada.close();
    }
}
