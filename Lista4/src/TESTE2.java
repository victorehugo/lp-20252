import java.util.Scanner;

public class TESTE2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0;

        // Leitura das notas
        System.out.println("Digite as notas dos 10 alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        // Cálculo da média
        double media = soma / notas.length;

        // Exibe a média
        System.out.println("\nMédia da turma: " + media);

        // Mostra os alunos acima da média
        System.out.println("\nAlunos acima da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Aluno " + (i + 1) + " (índice " + i + ") → Nota: " + notas[i]);
            }
        }
    }
}
