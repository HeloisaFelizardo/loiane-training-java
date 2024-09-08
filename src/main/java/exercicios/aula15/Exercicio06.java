package exercicios.aula15;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite tres números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        entrada.close();

        int maior;
        
        if(n1 > n2 && n1 > n3){
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        }else{
            maior = n3;
        }
        System.out.println("O maior número é : " + maior);
    }
}
