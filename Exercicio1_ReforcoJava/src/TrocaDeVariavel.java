import java.util.Scanner;

public class TrocaDeVariavel {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int a,b,c;
        System.out.println("Informe o valor de A ");
        a = entry.nextInt();
        System.out.println("Informe o valor de B");
        b = entry.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Valor de A: "  + a);
        System.out.println("Valor de B: " + b);


    }
}
