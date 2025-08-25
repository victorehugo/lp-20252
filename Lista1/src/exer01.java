import java.util.Scanner;


public class exer01 {
    public static void main(String[] args){

        String nome, clas;
        float peso, altura, Imc;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o seu nome:");
        nome = entrada.nextLine();

        System.out.println("Digite o seu peso:");
        peso = entrada.nextFloat();

        System.out.println("Digite a sua altura:");
        altura = entrada.nextFloat();

        Imc = peso*altura;

        if (Imc < 18.5){
            clas = "Abaixo do peso";
        }

        else if (Imc >= 18.5 && Imc < 25) {
            clas = "Peso Normal";

        } else if (Imc >= 25 && Imc < 30) {
            clas = "Acima do peso";
            
        }

        else {
            clas = "Obeso";
        }

        System.out.println("Paciente" +nome+ "tem IMC =" +Imc+ "e está classificado como" + clas);


    }
}
