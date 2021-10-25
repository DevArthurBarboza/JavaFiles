import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double peso = 0, altura = 0, imc = 0;


        System.out.println("Imforme seu peso e sua altura");
        peso = entry.nextDouble();
        altura = entry.nextDouble();
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 24.9 && imc < 29.9) {
        System.out.println("Sobrepeso");
        } else {
            System.out.println("Sobrepeso");
        }
    }
}
