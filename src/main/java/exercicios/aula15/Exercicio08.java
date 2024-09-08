package exercicios.aula15;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço de três produtos: ");
        double produto1 = entrada.nextDouble();
        double produto2 = entrada.nextDouble();
        double produto3 = entrada.nextDouble();
        entrada.close();

        double maisBarato;

        if (produto1 <= produto2 && produto1 <= produto3) {
            maisBarato = produto1;
            System.out.println("Você deve comprar o produto 1, que é o mais barato: R$ " + String.format("%.2f", maisBarato));
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            maisBarato = produto2;
            System.out.println("Você deve comprar o produto 2, que é o mais barato: R$ " + String.format("%.2f", maisBarato));
        } else {
            maisBarato = produto3;
            System.out.println("Você deve comprar o produto 3, que é o mais barato: R$ " + String.format("%.2f", maisBarato));
        }
    }
}

