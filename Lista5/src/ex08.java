
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] mat = new int[3][3];
        int [][] mat1 = new int[3][3];
        int [][] mat2 = new int[3][3];

        System.out.println("Gerando a primeira Matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = (int) (Math.random() *10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Gerando a segunda Matriz:");
        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1.length; j++) {
                mat1 [i][j] = (int) (Math.random() *10);
                System.out.print(mat1[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Gerando a terceira Matriz:");
        for (int i = 0; i < mat2.length; i++){
            for (int j = 0; j < mat2.length; j++) {
                mat2 [i][j] = mat[i][j] + mat1[i][j];
                System.out.print(mat2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
