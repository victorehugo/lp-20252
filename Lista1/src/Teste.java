import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o nome do produto");
        String nomep = entrada.nextLine();

        System.out.println("Escreva a quantidade de produtos compradas");
        float quant = entrada.nextFloat();

        System.out.println("Preço do produto;");
        float pre = entrada.nextFloat();

        System.out.println("Digite o numero da forma de pagamento\n 1_Pix \n 2_Cartão \n 3_Boleto");
        int pagamento = entrada.nextInt();

        float subtotal = quant * pre;

        float desconto;

        if (subtotal < 100) {
            desconto = subtotal;
        }
        else if (subtotal >= 100 && subtotal < 300){
            desconto = subtotal - subtotal*5/100;

        }
        else {
            desconto = subtotal - subtotal*10/100;

        }

        float descontopag;

        if (pagamento ==  1) {
            descontopag = desconto - subtotal*2/100;
        }

        else if (pagamento == 2) {
            descontopag = desconto - desconto * 1.5f / 100;
        }

        else {
            descontopag = desconto;
        }

        System.out.println("Produto: " + nomep);
        System.out.println("Quantidade comprada: " + quant);
        System.out.println("Total sem desconto: R$" + subtotal);
        System.out.println("Total com desconto: R$" + descontopag);
        System.out.println("Forma de pagamento(1_Pix 2_Cartão 3_Boleto): " + pagamento);


    }
}
