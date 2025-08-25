import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bom Dia");

        char letra = 'A';  //letras
        float nota = 6.5f; //Real
        int idade = 19;  //Inteiro
        boolean resposta = true;  //V ou F
        String nome = "Victor";  //Cadeia

        System.out.printf("Letra:"+letra+"\nNota:"+nota+"\nIdade:"+idade+"\nResposta:"+resposta+"\nNome:"+nome+"\n\n\n");


        //comando de entrada;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a sua nota:");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite a sugunda nota:");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite o nome do Aluno:");
        String NomeAluno = entrada.nextLine();
        //Line é usado para clc nome composto

        //soma e media das notas do aluno

        float soma = nota1 + nota2;
        float media = soma / 2;

        System.out.println("Nome"+NomeAluno+"\nPrimenira Nota:"+nota1+"\nSegunda Nota:"+nota2+"\nMedia"+media);

        System.out.println("\n\n\n");

        //exer1

        System.out.println("Nome:");
        String Nomefun = entrada.nextLine();

        System.out.println("Digite as horas trabalhadas:");
        Float Horas = entrada.nextFloat();

        System.out.println("Valor da Hora");
        Float Valor = entrada.nextFloat();

        float sala = Valor * Horas;

        System.out.println("Nome:"+Nomefun+"\nSalario:"+sala+"Reais");







    }
}