import java.util.*;

public class ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[5];

        System.out.println("Escreva os valores do vetor: ");
        for (int i = 0; i < vetor1.length ; i++ ){
            vetor1[i] = entrada.nextInt();
        }
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int num : vetor1) {
            // Se já existe, soma +1, senão começa em 1
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        // Mostrar resultado
        System.out.println("\nFrequência dos valores:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println("Número " + entry.getKey() + " aparece " + entry.getValue() + " vezes");
        }
    }
}
