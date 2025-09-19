import java.util.Scanner;

public class exerFor01 {
    public static void  main(String[] args){

        Scanner e = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada desejada:");
        int num = e.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(+num+ "X" +i+ "=" +i*num);
        }
    }
}
