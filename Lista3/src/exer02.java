import java.util.Scanner;

public class exer02 {
    public static void  main(String[] args){
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de a:");
        a = sc.nextInt();

        System.out.println("Informe o valor de b:");
        b = sc.nextInt();

        System.out.println("Informe o valor de c:");
        c = sc.nextInt();

        System.out.println("Informe o valor de d:");
        d = sc.nextInt();

        System.out.println("Informe o valor de e:");
        e = sc.nextInt();

        int troca;
        for (int i=1; i <= 4; i++){
            if (a > b){
                troca = a;
                a = b;
                b = troca;
            }
            if (b > c){
                troca = b;
                b = c;
                c = troca;
            }
            if (c > d){
                troca = c;
                c = d;
                d = troca;
            }
            if (d > e){
                troca = d;
                d = e;
                e = troca;
            }
        }
        System.out.println("Elementos ordenados:  " +a+ " " +b+ " " +c+ " " +d+ " " +e);

    }
}
