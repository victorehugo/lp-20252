
import java.util.Scanner;
public class ex_menubank {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opçao;
        float saldo = 1000;
        String [] vetor = new String [1000];
        int indice = 0;
        do {;
            System.out.println("===== MENU BANCÁRIO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver extrato");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opçao = entrada.nextInt();
            switch (opçao){

                case 1:
                    System.out.println("Seu saldo é de :==="+saldo+"===\n");
                    break;

                case 2:
                    System.out.println("Escreva o valor desejado: \n");
                    float deposito = entrada.nextFloat();
                    saldo = saldo + deposito;
                    System.out.println("Seu saldo é de :==="+saldo+"===\n");
                    vetor [indice] = "Deposito foi de :"+deposito;
                    indice++;
                    break;

                case 3:
                    System.out.println("escreva o valor desejado : \n");
                    float sacar = entrada.nextFloat();
                    if (sacar < saldo) {
                        saldo = saldo - sacar;
                        System.out.println("Seu saldo é de :==="+saldo+"===\n");
                        vetor [indice] = "Saque foi de :"+sacar;
                        indice++;
                    }
                    else System.out.println("Saldo insuficiente:");
                    break;

                case 4:
                    System.out.println("===EXTRATO===");
                    for (int i = 0 ; i<indice ; i++){
                        System.out.println(vetor[i]);
                    }
                    break;

                case 5:
                    System.out.println("Obrigado pela por acessar nosso site");
                    break;
            }
        }
        while (opçao != 0);
    }
}
