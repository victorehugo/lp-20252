import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[5];
        int[] vetor2 = new int[5];

        // GERANDO VETOR
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i) + ": ");
            vetor[i] = entrada.nextInt();
            vetor2[i] = vetor[i] * 2;
        }

        // 1 VETOR
        System.out.println("\nVetor original:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        // 2 VETOR
        System.out.println("\n\nVetor com dobro dos valores:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor2[i] + " ");
        }
    }
}
