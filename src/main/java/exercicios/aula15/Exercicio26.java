package exercicios.aula15;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();
        System.out.println("Tipo de combustível (A-álcool, G-gasolina): ");
        String tipoCombustivel = scanner.next().toUpperCase();
        scanner.close();

        double precoAlcool = 1.9;
        double precoGasolina = 2.5;
        double desconto = 0;
        double valorTotal = 0;

        if (tipoCombustivel.equals("A")) {
            if (litrosVendidos <= 20) {
                desconto = 3;
            } else {
                desconto = 5;
            }
            valorTotal = litrosVendidos * precoAlcool;
            System.out.println("Combustível: Alcool");
        } else if (tipoCombustivel.equals("G")) {
            if (litrosVendidos <= 20) {
                desconto = 4;
            } else {
                desconto = 6;
            }
            valorTotal = litrosVendidos * precoGasolina;
            System.out.println("Combustível: Gasolina");
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        double valorDesconto = valorTotal * desconto / 100;
        double valorAPagar = valorTotal - valorDesconto;

        System.out.println("Litros vendidos: " + litrosVendidos + " L");
        System.out.println("Preço total sem desconto: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Desconto aplicado: " + desconto + "%");
        System.out.println("Valor do desconto: R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Valor a ser pago: R$ " + String.format("%.2f", valorAPagar));
    }
}
