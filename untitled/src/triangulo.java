import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        double base, altura, area;
        do {

            Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("Informe o valor da base");
                base = entrada.nextDouble();
                if (base <= 0) {
                    System.out.println("Valor incorreto" + " \n");
                }
            } while (base <= 0);

            do {
                System.out.println("Informe o valor da altura");
                altura = entrada.nextDouble();

                if (altura <= 0) {
                    System.out.println("Valor incorreto" + " \n");
                }

            } while (altura <= 0);
            area = (base * altura) / 2;

        } while (area < 0);
        System.out.println ("A área do triâgulo é " + area);
    }
}
