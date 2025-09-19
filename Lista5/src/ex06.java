
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] mat = new int[5][5];

        System.out.println("Gerando Matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = (int) (Math.random() *10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        int px = 0;
        int py = 0;
        int nmaior = mat [0][0];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                if (nmaior < mat[i][j]){
                    nmaior = mat [i][j];
                    px = i;
                    py = j;
                }
            }
        }
        System.out.println("O maior numero da matriz é :"+ nmaior);
        System.out.println("Sua posição esta na linha; " +px);
        System.out.println("Sua posição esta na colna; "+ py);
    }
}
