
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] mat = new int[3][4];
        String [] nome = new String[3];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Escreva o nome dos alunos;");
            nome[i] = entrada.nextLine();
        }

        System.out.println("Gerando Matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = (int) (Math.random() *15);
            }
        }

        System.out.println("Matriz Gerada \n");
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n media dos alunos \n");
        for (int i = 0; i < mat.length ; i++) {
            int soma = 0;
            int media = 0;
            for (int j = 0; j < mat.length ; j++) {
                soma += mat[i][j];
                media = soma / 4;
            }
            System.out.println("A media do aluno " + nome[i] + " = " + media);
        }
    }
}
