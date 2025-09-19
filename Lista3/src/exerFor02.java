import java.util.Scanner;

public class exerFor02 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = e.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // verifica se é par
                soma += i;
            }
        }
        System.out.println("A soma dos pares de 1 até " + n + " é: " + soma);
    }
}
