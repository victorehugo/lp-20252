import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[10];
        int pos = 0;

        System.out.println("Escreva o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++ ){
            vetor1 [i] = entrada.nextInt();

        }


        System.out.println("Escreva segundo vetor:");
        for (int i = 0; i < vetor2.length; i++){
            vetor2 [i] = entrada.nextInt();
        }


        for (int i = 0; i < vetor3.length; i++){
            vetor3[pos++] = vetor1[i];
            vetor3[pos++] = vetor2[i];
        }


        for (int i = 0; i < vetor3.length; i++){
            System.out.println(vetor3[i]);
        }
    }
}
