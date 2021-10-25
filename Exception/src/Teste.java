import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1,nota2, media;
        System.out.println("Informe a nota 1");
        nota1 = input.nextDouble();
        System.out.println("Informe a nota 2");
        nota2 = input.nextDouble();
        media = (nota1 + nota2)/ 2;
        System.out.println("A sua média é " + media);
    }
}
