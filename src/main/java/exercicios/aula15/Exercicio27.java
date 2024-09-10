package exercicios.aula15;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade de morangos (kg): ");
        double morangos = entrada.nextDouble();
        System.out.println("Quantidade de maçãs (kg): ");
        double macas = entrada.nextDouble();
        entrada.close();

        double precoMorangos = 0;
        double precoMacas = 0;
        double precoTotal = 0;
        double pesoTotal = morangos + macas;

        // Calcula o preço dos morangos
        if (morangos <= 5) {
            precoMorangos = morangos * 2.5;
        } else {
            precoMorangos = morangos * 2.2;
        }

        // Calcula o preço das maçãs
        if (macas <= 5) {
            precoMacas = macas * 1.8;
        } else {
            precoMacas = macas * 1.5;
        }

        precoTotal = precoMorangos + precoMacas;

        System.out.println("Preço dos morangos: R$ " + String.format("%.2f", precoMorangos));
        System.out.println("Preço das maçãs: R$ " + String.format("%.2f", precoMacas));
        System.out.println("Peso total: " + pesoTotal + " kg");

        // Verifica se há desconto
        if (pesoTotal > 8 || precoTotal > 25) {
            precoTotal *= 0.9;  // Aplica 10% de desconto
            System.out.println("Desconto aplicado: 10%");
        }

        System.out.println("Preço total a pagar: R$ " + String.format("%.2f", precoTotal));
    }
}
