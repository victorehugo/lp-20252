import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[9];

        // PEGANDO OS NUMEROS DO VETOR
        System.out.println("Vetor Gerado:");
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() *10);
            System.out.print(vetor[i]+" ");
        }

        int maior = vetor[0];int posMaior = 0;
        int menor = vetor[0];int posMenor = 0;


        // PROCURANDO O VALOR MAIOR NO VETOR
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            // PROCURANDO O MENOR VALOR NO VETOR
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }
        System.out.println("\nResultados:");
        System.out.println("Maior valor: " + maior + " (posição " + posMaior + ")");
        System.out.println("Menor valor: " + menor + " (posição " + posMenor + ")");
    }
}
