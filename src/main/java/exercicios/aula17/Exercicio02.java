package exercicios.aula17;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a senha: ");
        String senha = entrada.nextLine();

        while (nome.equals(senha)) {
            System.out.println("A senha não pode ser igual ao nome do usuário. Tente novamente.");
            System.out.println("Digite a senha: ");
            senha = entrada.nextLine();
        }

        System.out.println("Senha cadastrada com sucesso!");
        entrada.close();
    }
}
