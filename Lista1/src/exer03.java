import java.util.Scanner;

    public class exer03 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a primeira nota: ");
            float n1 = entrada.nextFloat();
            System.out.print("Digite o peso da primeira nota: ");
            int p1 = entrada.nextInt();

            System.out.print("Digite a segunda nota: ");
            float n2 = entrada.nextFloat();
            System.out.print("Digite o peso da segunda nota: ");
            int p2 = entrada.nextInt();

            System.out.print("Digite a terceira nota: ");
            float n3 = entrada.nextFloat();
            System.out.print("Digite o peso da terceira nota: ");
            int p3 = entrada.nextInt();

            // Cálculo da média de acordo com cada peso
            float media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

            // ver se o aluno aprova ou reprova
            String situacao;
            float notaExame = 0;

            if (media >= 7.0) {
                situacao = "Aprovado";
            } else if (media >= 4.0) {
                situacao = "Exame";
                // Cálculo da nota mínima no exame
                notaExame = 10 - media; // isolando: (media + exame)/2 >= 5 → exame >= 10 - media
            } else {
                situacao = "Reprovado";
            }

            System.out.println("Aluno: " + nome);
            System.out.printf("Média Ponderada: %.2f\n", media);
            System.out.println("Situação: " + situacao);

            if (situacao.equals("Exame")) {
                System.out.printf("Nota mínima necessária no exame: %.2f\n", notaExame);
            }
        }
    }

