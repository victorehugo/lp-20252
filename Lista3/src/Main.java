import java.util.Scanner;
public class Main {
    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        int contador = 1;
        float nota;
        float soma = 0;

        while (contador <= 5){
            System.out.println("Digite a sua " +contador+ " Nota");
            nota = sc.nextFloat();
            soma = soma + nota;
            contador++;
        }

        float media = soma / 5;
        System.out.println("A sua media é:"+media);
    }
}