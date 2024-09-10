package exercicios.aula15;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o tipo de carne desejado?");
        System.out.println("1 - Filé duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        int tipoCarne = entrada.nextInt();
        System.out.println("Quantos quilos de carne deseja comprar?");
        double pesoCarne = entrada.nextDouble();
        System.out.println("Possui cartão Tabajara? (1 - Sim, 2 - Não)");
        int cartaoTabajara = entrada.nextInt();
        entrada.close();

        double precoKg = 0;
        double precoTotal = 0;
        String tipoCarneStr = "";

        switch (tipoCarne) {
            case 1:
                if (pesoCarne <= 5) {
                    precoKg = 4.9;
                } else {
                    precoKg = 5.8;
                }
                tipoCarneStr = "Filé duplo";
                break;
            case 2:
                if (pesoCarne <= 5) {
                    precoKg = 5.9;
                } else {
                    precoKg = 6.8;
                }
                tipoCarneStr = "Alcatra";
                break;
            case 3:
                if (pesoCarne <= 5) {
                    precoKg = 6.8;
                } else {
                    precoKg = 7.8;
                }
                tipoCarneStr = "Picanha";
                break;
            default:
                System.out.println("Tipo de carne inválido.");
                return;
        }

        precoTotal = precoKg * pesoCarne;

        double desconto = 0;

        if (cartaoTabajara == 1) {
            desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            System.out.println("Desconto de R$ " + String.format("%.2f", desconto) + " aplicado.");
        }

        System.out.println("Tipo de carne: " + tipoCarneStr);
        System.out.println("Quantidade: " + pesoCarne + " kg");
        System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));
        System.out.println("Cartão Tabajara: " + (cartaoTabajara == 1 ? "Sim" : "Não"));
        System.out.println("Valor do desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", precoTotal));
    }
}
