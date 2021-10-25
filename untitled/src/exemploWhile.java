import java.util.Scanner;

public class exemploWhile {
    public static void main(String[] args) {
        int qnt = 10, num = 0;

        Scanner entry = new Scanner(System.in);

        while (qnt != num){
            System.out.println ("Informe um número");
            num = entry.nextInt();
            if (qnt == num) {
                System.out.println("Acertou o número");

            } else {
                System.out.println("Errou o número");
            }




        }


    }
}
