package exercicios.aula17;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        double totalGeral = 0;
        double totalItem;

        while (true) {
            System.out.println("Menu de opções:");
            System.out.println();
            System.out.println("100. Cachorro quente - R$ 1,20");
            System.out.println("101. Bauru Simples - R$ 1,30");
            System.out.println("102. Bauru com ovo - R$ 1,50");
            System.out.println("103. Hambúrguer - R$ 1,20");
            System.out.println("104. Cheeseburguer - R$ 1,30");
            System.out.println("105. Refrigerante - R$ 1,00");
            System.out.println("0. Sair");

            System.out.println();

            System.out.print("Digite o código do produto: ");
            int codigo = scan.nextInt();

            // Encerrar o pedido
            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = scan.nextInt();

            totalItem = 0;

            switch (codigo) {
                case 100:
                    totalItem = quantidade * 1.20;
                    System.out.println(quantidade + "x Cachorro Quente - R$ " + String.format("%2.2f", totalItem));
                    break;
                case 101:
                    totalItem = quantidade * 1.30;
                    System.out.println(quantidade + "x Bauru Simples - R$ " + String.format("%2.2f", totalItem));
                    break;
                case 102:
                    totalItem = quantidade * 1.50;
                    System.out.println(quantidade + "x Bauru com ovo - R$ " + String.format("%2.2f", totalItem));
                    break;
                case 103:
                    totalItem = quantidade * 1.20;
                    System.out.println(quantidade + "x Hambúrguer - R$ " + String.format("%2.2f", totalItem));
                    break;
                case 104:
                    totalItem = quantidade * 1.30;
                    System.out.println(quantidade + "x Cheeseburguer - R$ " + String.format("%2.2f", totalItem));
                    break;
                case 105:
                    totalItem = quantidade * 1.00;
                    System.out.println(quantidade + "x Refrigerante - R$ " + String.format("%2.2f", totalItem));
                    break;
                default:
                    System.out.println("Código inválido");
                    continue; // Voltar ao início do loop se o código for inválido
            }

            totalGeral += totalItem; // Somar o valor do item ao total geral
            System.out.println("Subtotal: R$ " + String.format("%2.2f", totalGeral));
            System.out.println();
        }

        System.out.println();
        System.out.println("Total a pagar: R$ " + String.format("%2.2f", totalGeral));
        scan.close();
    }
}
