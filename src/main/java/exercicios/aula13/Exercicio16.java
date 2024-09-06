package exercicios.aula13;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        double area = entrada.nextDouble();

        // Cobertura de tinta: 1 litro para cada 3 metros quadrados
        double litrosNecessarios = area / 3;

        // Cada lata de tinta contém 18 litros
        double litrosPorLata = 18;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / litrosPorLata); // Arredonda para cima

        // Cálculo do preço
        double precoPorLata = 80.00;
        double precoTotal = latasNecessarias * precoPorLata;

        // Exibe o resultado
        System.out.printf("Quantidade de latas de tinta necessárias: %d%n", latasNecessarias);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);

        entrada.close();
    }
}
