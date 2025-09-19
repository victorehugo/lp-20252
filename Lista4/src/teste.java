import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        for (int i = 0; i < vetor1.length; i++){
            vetor1[i] = (int) (Math.random() *10);
            vetor2[i] = vetor1[i] * 2;
        }
        //exibindo os vetores
        System.out.println("Vetor 1");
        for (int i =0; i < vetor1.length; i++){
            System.out.print(vetor1[i]+" ");
        }

        System.out.println("\nVetor 2");
        for (int i = 0; i < vetor1.length; i++){
            System.out.print(vetor2[i]+" ");
        }


    }
}