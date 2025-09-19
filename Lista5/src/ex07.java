import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] mat = new int[3][2];   // matriz original 3x2
        int[][] transposta = new int[2][3]; // matriz transposta 2x3

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }

        // Geração da transposta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposta[j][i] = mat[i][j];
            }
        }

        // Exibição da matriz original
        System.out.println("\nMatriz Original (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Exibição da transposta
        System.out.println("\nMatriz Transposta (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
