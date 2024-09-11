package exercicios.aula17;

public class Exercicio16 {
    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci até que o termo seja maior que 500: ");

        while (a <= 500) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
