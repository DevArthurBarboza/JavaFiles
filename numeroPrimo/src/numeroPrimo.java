import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        int quantdiv=0, valor;
        Scanner entry = new Scanner (System.in);
        System.out.println("Informe um valor");
        valor=entry.nextInt();
        for (int i = 1; i <= valor;i++){
            if ( valor % i == 0) {
                System.out.println(valor + " é divisível por " + i );
                quantdiv+= 1;
            }

        }
        if (quantdiv == 2) {
            System.out.println("");
            System.out.println(valor +" é primo");
        }else {
            System.out.println("");
            System.out.println( valor + " não é primo");
        }
    }
}
