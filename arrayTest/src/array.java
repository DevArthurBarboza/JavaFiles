import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        double arrayNumber[] = new double[10];
        double media = 0;

        Scanner entry = new Scanner(System.in);

        for (int i = 0; i < arrayNumber.length; i++){

            System.out.println("Informe um número");
            arrayNumber[i] = entry.nextDouble();
            media += arrayNumber[i];

        }
        media = (media / arrayNumber.length);
        System.out.println(media);


    }
}
