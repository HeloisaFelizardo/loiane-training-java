package exercicios.aula17;

public class Exercicio04 {
    public static void main(String[] args) {
        double populacaoPaisA = 80000;
        double populacaoPaisB = 200000;

        int anos = 0;

        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += (populacaoPaisA / 100) * 3;
            populacaoPaisB += (populacaoPaisB / 100) * 1.5;
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população do país A ultrapassará a população do país B.");
    }
}
