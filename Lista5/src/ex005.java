import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float [][] mat = new float[3][4];
        String [] nome = new String[3];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Escreva o nome dos alunos;");
            nome[i] = entrada.next();
            System.out.println("escreva as notas do aluno:");
            for (int j = 0; j < 4; j++) {
                mat[i][j] = entrada.nextFloat();
            }
        }

        System.out.println("\n media dos alunos \n");
        for (int i = 0; i < mat.length ; i++) {
            float soma = 0;
            float media = 0;
            for (int j = 0; j < mat.length ; j++) {
                soma += mat[i][j];
                media = soma / 4;
            }
            System.out.println("A media do aluno " + nome[i] + " = " + media);
        }
    }
}
