package exercicios.aula17;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Lojas Tabajara");

            double valor;
            double total = 0;
            int i = 1;

            // Inserindo produtos até o valor ser 0
            while (true) {
                System.out.printf("Produto %d: R$ ", i);
                valor = entrada.nextDouble();
                if (valor == 0) {
                    break;
                }
                total += valor;
                i++;
            }

            // Exibindo o total da compra
            System.out.printf("Total: R$ %.2f%n", total);

            // Entrada do valor pago
            System.out.print("Dinheiro: R$ ");
            double dinheiro = entrada.nextDouble();

            // Calculando e mostrando o troco
            System.out.printf("Troco: R$ %.2f%n", (dinheiro - total));

            System.out.println("Volte sempre!");
            System.out.println("............................................");

            // Pergunta se o usuário deseja finalizar
            System.out.print("Deseja registrar outra compra? (s/n): ");
            char opcao = entrada.next().charAt(0);

            if (opcao == 'n' || opcao == 'N') {
                System.out.println("Encerrando o programa. Obrigado por usar as Lojas Tabajara!");
                break;
            }
        }

        entrada.close();
    }
}
