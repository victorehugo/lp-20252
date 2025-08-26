import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println(" BEM VINDOS\n\n ");
        System.out.println("Digite o valor da compra (negativo para encerrar):");

        float valor = e.nextFloat();
        float soma = 0;
        float quant = 0;
        while (valor > 0){
            soma = soma + valor;
            quant++;
            System.out.println("Digite o valor da compra (negativo para encerrar): ");
            valor = e.nextFloat();
        }
        float media = 0;
        if (quant !=0){
            media = soma/quant;
        }

        System.out.println("Total de vendas: R$ " + soma + "\n");
        System.out.println("Clientes atendidos:" + quant + "\n");
        System.out.println("Media por cliente" +media);
    }
}