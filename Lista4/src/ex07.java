import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[0];

        System.out.println("Escreva os valores do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = entrada.nextInt();
        }

        System.out.println("Escreva os valores do segundo vetor;");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = entrada.nextInt();
        }

        Set<Integer> intersecao = new HashSet<>();

        System.out.println("Valores dos vetores que se interagem:");
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    intersecao.add(vetor1[i]);
                    System.out.println(vetor1[i]);
                }
            }
        }
    }
}
