import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

        String nome;
        float horas, valor, sal;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = entrada.nextLine();

        System.out.println("Escreva quantas horas trabalhadas");
        horas = entrada.nextFloat();

        System.out.println("Escreva o valor das horas em reais: ");
        valor = entrada.nextFloat();

        sal = horas * valor;

        System.out.println("O funcionario:" + nome + " Recebe de salario:" + sal + "Reais");

    }

}