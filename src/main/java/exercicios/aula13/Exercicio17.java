package exercicios.aula13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        double area = entrada.nextDouble();

        // Cobertura da tinta: 1 litro para cada 6 metros quadrados
        double litrosNecessarios = area / 6;

        // Adicionando 10% de folga
        litrosNecessarios *= 1.1;

        // Definindo capacidades e preços das latas e galões
        double litrosPorLata = 18;
        double litrosPorGalao = 3.6;
        double precoLata = 80.00;
        double precoGalao = 25.00;

        // Cálculo apenas com latas de 18 litros
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / litrosPorLata);
        double precoLatas = latasNecessarias * precoLata;

        // Cálculo apenas com galões de 3,6 litros
        int galoesNecessarios = (int) Math.ceil(litrosNecessarios / litrosPorGalao);
        double precoGaloes = galoesNecessarios * precoGalao;

        // Cálculo da mistura de latas e galões
        int latasMistura = (int) (litrosNecessarios / litrosPorLata);
        double litrosRestantes = litrosNecessarios % litrosPorLata;
        int galoesMistura = (int) Math.ceil(litrosRestantes / litrosPorGalao);
        double precoMistura = (latasMistura * precoLata) + (galoesMistura * precoGalao);

        // Exibindo resultados
        System.out.printf("Comprando apenas latas de 18 litros:%n");
        System.out.printf("Quantidade de latas: %d%n", latasNecessarias);
        System.out.printf("Preço total: R$ %.2f%n", precoLatas);

        System.out.printf("%nComprando apenas galões de 3,6 litros:%n");
        System.out.printf("Quantidade de galões: %d%n", galoesNecessarios);
        System.out.printf("Preço total: R$ %.2f%n", precoGaloes);

        System.out.printf("%nMisturando latas e galões para o menor preço:%n");
        System.out.printf("Quantidade de latas: %d e galões: %d%n", latasMistura, galoesMistura);
        System.out.printf("Preço total: R$ %.2f%n", precoMistura);

        entrada.close();
    }
}
