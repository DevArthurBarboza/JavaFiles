import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int soma,num1,num2;
        Scanner entry = new Scanner(System.in);
        System.out.println("Informe 2 números");
        num1 = entry.nextInt();
        num2 = entry.nextInt();
        soma = num1 + num2;
        System.out.println(soma);
    }
}
