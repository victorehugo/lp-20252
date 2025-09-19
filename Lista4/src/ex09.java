import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] vetornome = new String[5];
        int[] vetornotas = new int[5];


        for (int i = 0; i < 5; i++){
            System.out.println("Escreva o nome do aluno:");
            vetornome[i] = entrada.nextLine();
            for (int j = 0; j < 5; j++) {
                System.out.println("Escreva a nota do aluno:");
                vetornotas[j] = entrada.nextInt();
            }
        }
    }
}
