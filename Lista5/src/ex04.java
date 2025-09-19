import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o valor do tamanho da matriz:");
        int tamanho = entrada.nextInt();


        int mat1[][] = new int[tamanho][tamanho];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if ( i == j){
                    mat1[i][j] = 1;
                }
                else {
                    mat1[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
